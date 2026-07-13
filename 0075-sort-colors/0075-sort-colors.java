class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int zeroes=0,ones=0,twos=0;


        for(int i=0;i<n;i++){
            if(nums[i]==0)zeroes++;
            else if (nums[i]==1)ones++;
            else twos++;
        }

        int place=0;
        for(int i=0;i<n;i++){
            if(zeroes-->0){
                nums[place++]=0;

            }
            else if(ones-->0)nums[place++]=1;
            else nums[place++]=2;
        }
    }
}