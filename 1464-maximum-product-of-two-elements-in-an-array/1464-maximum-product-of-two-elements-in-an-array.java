class Solution {
    public int maxProduct(int[] nums) {
        int firstLargest=0;
        int secondLargest=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>firstLargest){
                secondLargest=firstLargest;
                firstLargest=nums[i];
            }
            else if(nums[i]>secondLargest){
                secondLargest=nums[i];
            }
        }
        return (firstLargest-1)*(secondLargest-1);
        
    }
}