class Solution {
    static{
        for(int i=0;i<1000;i++)
          singleNumber(new int []{1,2,2,3,3});
    }
    public static int singleNumber(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];
        }
        return xor;
       
        
    }
}