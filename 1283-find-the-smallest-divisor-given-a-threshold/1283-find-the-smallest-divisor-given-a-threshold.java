class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int min=1,max=nums[0];
        for(int num:nums){
            max=Math.max(max,num);
        }

        while(min<=max){
            int mid=(min+max)/2;
            int result=findSum(nums,mid);
            if(result<=threshold){
                max=mid-1;
            }
            else min=mid+1;
        }
        return min;
        
    }
    static int findSum(int []nums,int mid){
        int sum=0;
        for(int num:nums){
            sum+=(num+mid-1)/mid;
        }
        return sum;
    }
}