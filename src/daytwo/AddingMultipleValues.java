package daytwo;

import java.util.ArrayList;
import java.util.Scanner;

public class AddingMultipleValues {
	
	// ask user for number of values to be added
	//ask user for each of those values and store them in arraylist
	//sum arraylist and print value

	public static void main(String[] args) {
		
		ArrayList<Double> values = new ArrayList<Double>();
		double sum = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.println("How many values?");
		int n = in.nextInt();
		
		System.out.println("pls enter your values");
		for (int i = 0; i < n; i++) {
			double k = in.nextDouble();
			values.add(k);
		}
		
		for(Double d : values) {
			sum += d;
		}
		
		System.out.printf("The sum is %f", sum);
		in.close();

	}

}
