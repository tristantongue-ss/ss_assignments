package daythree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class CountChars {

	public static void main(String[] args) {
		
		System.out.println("What character should we count?");
		String fileName = "avengers.txt";
		Integer counter = 0;
		Scanner in = new Scanner(System.in);
		String line = in.next();
		char c = line.charAt(0);
		
		in.close();
		 
		 
		try (BufferedReader buf = new BufferedReader(new FileReader(fileName))) {
			System.out.println("Printing from File");
			String text = buf.readLine();
				
			for( int i = 0; i < text.length(); i++) {
				if (text.charAt(i) == c) {
						counter++;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		 System.out.println(counter);
	}

}
