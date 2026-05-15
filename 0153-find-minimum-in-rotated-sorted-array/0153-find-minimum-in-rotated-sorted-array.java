class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;

        int start=0,end=n-1;

        while(start<end){
            int index=start+ (end-start)/2;

            if(nums[index]>nums[index+1])
                return nums[index+1];

            else if(nums[index]>nums[end]) {
                start=index+1;
            }
            else end=index;
        }

        return nums[start];
        
    }


    
}