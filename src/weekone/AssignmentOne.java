package weekone;

import java.util.Scanner;

public class AssignmentOne {

	
	public static void main(String[] args) {
		System.out.println("starting, enter num of cases: ");
		Integer cases =0;
		
		Scanner in = new Scanner(System.in);
		
		cases = in.nextInt();
		
		in.nextLine();
		
		for(int i =0; i < cases; i++) {
			System.out.println("Enter condition and number space separated: ");
			int condition = 0;
			int num = 0;
			
			try {
				condition = in.nextInt();
				num = in.nextInt();
			} catch (Exception e) {
				System.out.println("Exception found");
			}
			
			System.out.println("Condition: " + condition + "\nnumbers: " + num);
			in.nextLine();
			
			switch (condition) {
			case 1:
				System.out.println(isOdd().check(num) ? "EVEN" : "Odd");
				break;
			case 2:
				System.out.println(isPrime().check(num) ? "PRIME" : "COMPOSITE");
				break;
			case 3:
				System.out.println(isPalindrome().check(num) ? "PALINDROME" : "NOT PALINDROME");
				break;
			default:
				System.out.println("No can do");
				break;
			}
			
		}
		in.close();
		
	}
	
	
	
	public static PerformOperation isOdd() {
		    return (int n) -> n % 2 == 0;
		}
	 
	
	public static PerformOperation isPrime() {
		 return (int n) -> {
			 for (int i = 2; i < n; i++) {
		        if (n % i == 0) {
		          return false;
		        }
		      }
		      return true;
		    };
		}
	
	
	public static PerformOperation isPalindrome() {
		return (int n) -> {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(n);
			int length = stringBuilder.length();
			StringBuilder revstring = new StringBuilder();
			
			for (int i = length -1; i >= 0; i--) {
				revstring.append(stringBuilder.charAt(i));
			}
			return stringBuilder == revstring;
		};
	}
	
	
}
