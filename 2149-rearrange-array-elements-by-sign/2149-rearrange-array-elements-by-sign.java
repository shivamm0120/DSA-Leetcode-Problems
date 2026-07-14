class Solution {
    public int[] rearrangeArray(int[] nums) {
       int even=0;int odd=1;
       int n=nums.length;
       int []ans= new int [n];
       for(int num:nums){
        //for +ve elements
        if(num>0){
            ans[even]=num;
            even+=2;
        }
        else {
            ans[odd]=num;
            odd+=2;
            }

       }
       return ans;
    }
}