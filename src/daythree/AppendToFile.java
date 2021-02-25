package daythree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendToFile {
	
	public static void main(String[] args) {
		System.out.println("Enter your text: ");
		Scanner in = new Scanner(System.in);
		String text = in.nextLine();
		
		appendStrToFile("example.txt", text);
		
		in.close();
	}
	
	
	public static void appendStrToFile(String fileName, String str) {
		
		try {
				BufferedWriter out = new BufferedWriter( new FileWriter(fileName, true)); 
				out.write(str); 
				out.close(); 
			} 
				catch (IOException e) { 
				System.out.println("exception occoured" + e); 
			}
		
	} 
	
}
