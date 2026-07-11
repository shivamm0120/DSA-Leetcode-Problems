class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int x=1;
        while(x<n){
            if(nums[x]<nums[x-1])break;
            x++;
        }
        if(x==n)return true;

        for(int i=x;i<n+x-1;i++){
            if(nums[i%n]>nums[(i+1)%n])return false;

        }
        return true;
        

    }
       
}