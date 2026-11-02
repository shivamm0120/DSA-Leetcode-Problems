class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;

        int sum=0;
        int mid_index=n/2;
        int leftSum=0,rightSum=0;
        for(int i=0;i<n;i++){
            if(i<mid_index)
              leftSum+=nums[i];
            else if(i>mid_index)
               rightSum+=nums[i];
         
        }
        int moves=rightSum-leftSum;
        return (n%2==0)?moves+nums[mid_index]:moves;

        
    }
}