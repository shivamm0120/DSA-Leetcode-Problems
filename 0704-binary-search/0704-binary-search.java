class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        if(nums[0]==target)return 0;

        while(low<=high){
            int index=low+(high-low)/2;
            if(nums[index]==target)return index;
            else if(nums[index]>target){
                high=index-1;
            }
            else low=index+1;
        }
        return -1;

        
    }
}