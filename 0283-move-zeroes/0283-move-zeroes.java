class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;int positive=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[positive]=nums[i];
                positive++;
            }

        }
        while(positive<n){
            nums[positive]=0;
            positive++;
        }
        
    }
}