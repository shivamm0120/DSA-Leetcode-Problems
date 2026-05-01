class Solution {
    public int maxRotateFunction(int[] nums) {
        int n= nums.length;
        int sum=0;
        int digitSum=0;

        for(int i=0;i<n;i++){
            digitSum+=nums[i];
            sum+=i*nums[i];
        }
        int maxSum=sum;
        int last=n-1;

        while(last>0){

            // int extraAdded= digitSum-nums[last];
            // sum = sum- (n-1)*nums[last] + extraAdded;

            //above 2 line is also correct ..but we can write clean code
            //above expression can be written as -
                 //sum = sum - (n-1)*nums[last] + extraAdded
                 //    =>sum- (n-1)*nums[last]+digitSum-nums[last]
                 //  take nums[last]common --
                 //   sum+ digitSum- (n-1+1)nums[last]
                 //or sum=sum + digitSum- n*nums[last];

            sum=sum+digitSum-n*nums[last];
            maxSum=Math.max(sum,maxSum);
            last--;
        }
        return maxSum;
    }
}