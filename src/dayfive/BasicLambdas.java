package dayfive;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicLambdas {
	

	public static void main(String[] args) {
		
		List<String> mylist = Arrays.asList("football", "tennis", "basketball", "golf", "cricket", "rugby");
		List<Integer> intlist = Arrays.asList(1,5,3,65,34,83,64,14);
		
		
		sortByLength(mylist);
		sortByLengthReversed(mylist);
		sortByAlpha(mylist);
		sortByE(mylist);
		insertEO(intlist);
	}
	
	public static void sortByLength(List<String> list) {
		List<String> sortedList = list.stream().sorted( (s1, s2) -> s1.length() - s2.length() ).collect(Collectors.toList());
		System.out.println(sortedList);
		
	}

	public static void sortByLengthReversed(List<String> list) {
		List<String> sortedList = list.stream().sorted( (s1, s2) -> s2.length() - s1.length() ).collect(Collectors.toList());
		System.out.println(sortedList);
		
	}
	
	public static void sortByAlpha(List<String> list) {
		List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
	}
	
	public static void sortByE(List<String> list) {
		List<String> sortedList = list.stream().sorted( Comparator.comparingInt(s -> (s.contains("e") ? 0 : 1))).collect(Collectors.toList());
		System.out.println(sortedList);
		
	}
	
	public static void insertEO(List<Integer> list) {
		String sortedList = list.stream()
				  .map(i -> i % 2 == 0 ? "e" + i : "o" + i)
				  .collect(Collectors.joining(","));
		System.out.println(sortedList);
		
	}
	
	
	
}
