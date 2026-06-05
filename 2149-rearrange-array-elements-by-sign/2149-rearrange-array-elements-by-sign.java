class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int [] ans= new int [n];
        int pos_index=0,neg_index=1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                ans[pos_index]=nums[i];
                pos_index+=2;
            }
            else {
                ans[neg_index]=nums[i];
                neg_index+=2;
            }
        }
        return ans;
    }
}