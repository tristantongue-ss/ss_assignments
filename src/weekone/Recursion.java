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
		
		if (groupSum(position, nums, target - adjacentSum)) {
			return true;
		}
		
		if (groupSum(position, nums, target)) {
		      return true;
		    }
		
		return false;

	}

}
