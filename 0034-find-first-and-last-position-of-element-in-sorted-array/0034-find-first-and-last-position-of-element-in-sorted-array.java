class Solution {
  public int[] searchRange(int[] nums, int target) {

	    int first = firstOccur(nums, target);
	    int last = lastOccur(nums, target);

	    return new int[]{first, last};
	}

	int firstOccur(int[] nums, int target) {

	    int low = 0, high = nums.length - 1;
	    int first = -1;

	    while (low <= high) {

	        int mid = low + (high - low) / 2;

	        if (nums[mid] == target) {
	            first = mid;      // store answer
	            high = mid - 1;   // search left side
	        }
	        else if (nums[mid] < target) {
	            low = mid + 1;
	        }
	        else {
	            high = mid - 1;
	        }
	    }

	    return first;
	}

	int lastOccur(int[] nums, int target) {

	    int low = 0, high = nums.length - 1;
	    int last = -1;

	    while (low <= high) {

	        int mid = low + (high - low) / 2;

	        if (nums[mid] == target) {
	            last = mid;      // store answer
	            low = mid + 1;   // search right side
	        }

	        else if (nums[mid] < target) {
	            low = mid + 1;
	        }

	        else {
	            high = mid - 1;
	        }
	    }

	    return last;
	}
}