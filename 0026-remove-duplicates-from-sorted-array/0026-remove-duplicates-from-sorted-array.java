class Solution {
    public int removeDuplicates(int[] nums) {
        int uniquePointer=1;
        int n=nums.length;

        int i=1;
        while(i<n){

            while(i<n && nums[i]==nums[i-1]){
                i++;

            }
            if(i==n)break;
            nums[uniquePointer]=nums[i];
            uniquePointer++;
            i++;
                     
        }
        return uniquePointer;
        
    }
}