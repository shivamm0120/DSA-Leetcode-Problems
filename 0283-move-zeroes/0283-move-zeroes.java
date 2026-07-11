class Solution {
    public void moveZeroes(int[] nums) {
       int zeroes=0;
       int nonZeroes=0;

       for(int ele:nums){
        if(ele!=0) nums[nonZeroes++]=ele;
        else zeroes++;
       }
       int i=nonZeroes;
       while(i<nums.length){
        nums[i]=0;
        i++;
       }
        
    }
}