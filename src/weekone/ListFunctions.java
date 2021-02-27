package weekone;

import java.util.List;

public class ListFunctions {

	public static void main(String[] args) {


	}
	
	
	public static List<Integer> rightmostDigit(List<Integer> mylist) {
		mylist.replaceAll(i -> i%10);
		return mylist;
	}
	
	public static List<Integer> multiplyByTwo(List<Integer> mylist) {
		mylist.replaceAll(i -> i*2);
		return mylist;
	}
	
	public static List<String> removeX(List<String> mylist) {
		mylist.replaceAll(i -> i.replace("x", ""));
		return mylist;
	}

}
