package daytwo;

import java.util.ArrayList;

public class MaxNumberInArray {

	public static void main(String[] args) {
		int[][] mat = {{1, 2, 3},{8, 5, 6},{11,8,9}};
		int currenthighest = 0;
		int ourrow = 0;
		int ourcol = 0;
		for (int row = 0; row < mat.length; row++) {
			for (int col = 0; col < mat[row].length; col++) {
				int currentvalue = mat[row][col];
				if (currentvalue > currenthighest) {
					currenthighest = currentvalue;
					ourrow = row;
					ourcol = col;
				}
			}
		}
		ArrayList<Integer> location = new ArrayList<Integer>();
		location.add(ourrow);
		location.add(ourcol);
		
		System.out.println(location);
		System.out.println(currenthighest);

	}

}
