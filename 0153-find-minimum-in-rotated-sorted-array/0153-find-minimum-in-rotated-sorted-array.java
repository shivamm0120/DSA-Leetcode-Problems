class Solution {
    public int findMin(int[] nums) {
        int min =Integer.MAX_VALUE;
        int low=0,high=nums.length-1;

        while(low<=high){
            int mid =(low+high)/2;
            min=Math.min(min,nums[mid]);

            if(nums[low]<=nums[mid]){
                if(nums[low]>=nums[high])
                     low=mid+1;
                 else high=mid-1;    
            }else 
                high=mid-1;
        }
            
        return min;
    }
}