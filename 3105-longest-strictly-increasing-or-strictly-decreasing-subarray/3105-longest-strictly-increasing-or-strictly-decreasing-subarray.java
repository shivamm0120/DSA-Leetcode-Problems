class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n=nums.length;
        int max=1;
        int count=1;
        int start=0;
        boolean isIncreasing=true;

        for(int end=1;end<n;end++){
            if(nums[end]>nums[end-1]){

               if(!isIncreasing){
                max=Math.max(count,max);
                count=1;
                isIncreasing=true;

               }
                count++;
                
            }
            else if(nums[end]<nums[end-1]){
                if(isIncreasing){
                    max=Math.max(max,count);
                    count=1;
                    isIncreasing=false;

                }
                count++;
            }
            else {
                max=Math.max(max,count);
                count=1;
            }

        }
            if(max<count)max=count;
            return max;
        
    }
}