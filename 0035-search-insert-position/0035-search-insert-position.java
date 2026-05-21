class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;

        int position=0;
        while(low<=high){
                if(nums[low]>target){
                    position=low;
                    break;
                }
                if(nums[high]<target){
                    position=high+1;
                    break;
                }
                
            int index=low+(high-low)/2;
            int mid_value=nums[index];
            if(mid_value==target)return index;
            else if(mid_value<target){
                low=index+1;
            }
            else{
                high=index-1;
            }
        }
        return position;
        
    }
}