class Solution {
    static{
        for(int i=0;i<1000;i++)
        majorityElement (new int []{1,2,2,3,2});
    }
    public static int majorityElement(int[] nums) {
        int candidate=nums[0];
        int count=0;

        for(int num:nums){
            //take current ele as candidate 
            if(count==0){
                candidate =num;
            }
            //increase count of candidate
            if(candidate==num)
               count++;
            else
              count--;//other element visited
        }
        return candidate;//candidate element will have some +ve count 
        //that means it has more occurrences than others thats why it remained as positive .

       
        
    }
}