class Solution {
    public int splitArray(int[] nums, int k) {
        if(nums.length<k)return -1;
        int low =nums[0];
        int high=0;int ans=Integer.MAX_VALUE;
        for(int num:nums){
            low=Math.max(num,low);
            high+=num;
        }

        while(low<=high){
            int mid=(low+high)/2;
            if(countSub(nums,mid)<=k){
                high=mid-1;
            }
            else low=mid+1;
        }
        return low;
        
    }
    public static int countSub(int[] nums,int sumLimit){
        int count =1,sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]>sumLimit){
                count++;
                sum=nums[i];
            }
            else {
                sum=sum+nums[i];
            }
        }
        return count ;

    }
}