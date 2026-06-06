class Solution {
    public int waysToSplitArray(int[] nums) {
        int n= nums.length;
        int split=0;
        long[] first=new long [n];first[0]=nums[0];
        long[] last=new long [n];last[n-1]=0;

        for(int i=1;i<n;i++){
            first[i]=first[i-1]+nums[i];
        }
        for(int i=n-2;i>=0;i--){
            last[i]=last[i+1]+nums[i+1];
        }
        for(int i=0;i<n-1;i++){
            if(first[i]>=last[i])split++;
        }
        return split;
        
    }
}