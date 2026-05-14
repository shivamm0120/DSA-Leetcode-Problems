class Solution {
    public boolean isGood(int[] nums) {
        int max=nums[0];

        for(int num:nums){
            max=Math.max(num,max);

        }
        if(nums.length!=max+1)return false;

        int [] freq=new int [max+1];

        for(int num:nums){
            freq[num]++;
        }

        for(int i=1;i<=max;i++){
            if(i==max ) {
               if( freq[i]!=2)return false;
            }
            else {
                if(freq[i]!=1)return false;
            }

        }

      return true;  
    }
}