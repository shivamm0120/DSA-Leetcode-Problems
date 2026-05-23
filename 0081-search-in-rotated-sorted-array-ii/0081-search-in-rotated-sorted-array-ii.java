class Solution {
    public boolean search(int[] nums, int target) {
        int low=0,high=nums.length-1;
        while(low<=high){
            if(nums[low]==target||nums[high]==target)return true;
            int mid=(low+high)/2;
            if(nums[mid]==target)return true;

            //due to this condn we are not able to decide which part is sorted 
            //so do low++ and high++
            if(nums[low]==nums[mid]&& nums[mid]==nums[high]){
                low++;high--;
                continue;
            }

            //left part sorted
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<= nums[mid]){
                    high=mid-1;
                }
                else low=mid+1;

            }
            else{
                if(nums[mid]<=target&& target<=nums[high]){
                    low=mid+1;
                }else high=mid-1;

            }


        }
        return false;
        
    }
}