class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n= nums.length;
        int [] freq= new int [101];
        int [] res= new int [n];

        //finding frequencies 
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }

        //elements till i:
        for(int i=1;i<101;i++){
            freq[i]+=freq[i-1];
        }

        //so no of elemts lesser than value will be freq of the element of value -1
        for(int i=0;i<n;i++){
            if(nums[i]==0)res[i]=0;
            else 
            res[i]=freq[nums[i]-1];
        }

        
        return res;
        
    }
}
