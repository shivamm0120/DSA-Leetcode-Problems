class Solution {
    public int sumOfSquares(int[] nums) {
        int n=nums.length;
        int result=nums[0]*nums[0];

        for(int i=2;i<=n;i++){
            if(n%i==0){
                result+=nums[i-1]*nums[i-1];
            }
        }
        return result;
        
    }
}