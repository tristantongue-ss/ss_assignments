package daythree;

import java.io.File;

public class ListFiles {

	public static void main(String[] args) {
		try { File directoryPath = new File("/Users/tristan/Desktop/smoothstackjava/Assignments/src/daytwo");
		String contents[] = directoryPath.list();
		System.out.println("List of files and directories in the specified directory:");
	      for(int i=0; i<contents.length; i++) {
	         System.out.println(contents[i]);
	      }
		}
		catch(Exception e) {
		System.out.println("There was an exception");
		}
	}

}
