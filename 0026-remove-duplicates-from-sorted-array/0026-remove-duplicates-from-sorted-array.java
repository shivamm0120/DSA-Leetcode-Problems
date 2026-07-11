class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        int n=nums.length;

        int i=1;
        while(i<n){
            if(nums[i]==nums[i-1]){
                i++;
                continue;
            }
            
            nums[k]=nums[i];
            
            k++;
            i++;
        }
        return k;
    }
}