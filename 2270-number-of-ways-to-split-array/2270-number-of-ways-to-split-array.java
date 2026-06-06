class Solution {
    public int waysToSplitArray(int[] nums) {
        int n= nums.length;
        int split=0;
        long first=0;
        long sum=0;

        for(int i=0;i<n;i++){
            sum+=nums[i];
        }

        for(int i=0;i<n-1;i++){
            first+=nums[i];
            if(first>=(sum-first) )split++;
        }

        return split;
        
    }
}