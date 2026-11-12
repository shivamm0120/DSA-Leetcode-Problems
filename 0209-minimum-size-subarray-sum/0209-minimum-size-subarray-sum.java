class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int left=0;
        
        int count=0;
        int sum=0;
        int min=Integer.MAX_VALUE;

        for(int right=0;right<n;right++){
            sum+=nums[right];
            count++;

            while(sum>=target){
                sum-=nums[left];
                left++;
                min=Math.min(count,min);
                count--;
            }
        }
        return (min==Integer.MAX_VALUE)?0:min;
        
    }
}