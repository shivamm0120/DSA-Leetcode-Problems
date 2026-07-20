class Solution {
    public int pivotIndex(int[] nums) {
         int n=nums.length;

        int sum=0;int left=0;
        int right=0;

        for(int i=0;i<n;i++)
          sum+=nums[i];

        for(int i=0;i<n;i++){
            if(i==0)left=0;
            else left+=nums[i-1];
            right=sum-nums[i]-left;
            if(left==right)return i;
        }
        return -1;
        
    }
}