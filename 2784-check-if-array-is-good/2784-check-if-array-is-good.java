class Solution {
    public boolean isGood(int[] nums) {
        int n=nums.length;
        if(n==1)return false;
        Arrays.sort(nums);
        int arrangement=1;

        for(int i=0;i<n;i++){
           if(nums[i]!=arrangement)return false ;

           if(i==n-2)continue;
           arrangement++;
        }
        return true;
        
    }
}