package weekone;

public class Recursion {

	public static boolean groupSum(int start, int[] nums, int target) {
		
		if (start >= nums.length) {
			return target == 0;
		}
		int position = start;
		int adjacentSum = 0;
		
		while (position < nums.length && nums[start] == nums[position]) {
			adjacentSum += nums[position];
			position++;
		}
		
		
		// first check, subtract current number from target, begins another line of recursive calls
		if (groupSum(position, nums, target - adjacentSum)) {
			return true;
		}
		// other line of recursive calls, ignoring the current sum, ensures we find all possible permutations
		if (groupSum(position, nums, target)) {
		      return true;
		    }
		
		return false;

	}

}
