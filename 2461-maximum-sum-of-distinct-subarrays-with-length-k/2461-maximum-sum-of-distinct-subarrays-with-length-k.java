class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long max=0;
        long sum=0;

        int n=nums.length;
        int left=0,right=0;
        HashMap<Integer,Integer>hm=new HashMap<>();

        while(right<n){
            int curr=nums[right];
            if(hm.containsKey(curr)){
                int duplicate=hm.get(curr);
                while(left<=duplicate){
                    sum-=nums[left];
                    hm.remove(nums[left]);
                    left++;
                }
            }
            int windowSize=right-left+1;

            hm.put(curr,right);
            sum+=curr;
            if(windowSize<k){
                right++;
            }
            if(windowSize==k){
                if(max<sum)max=sum;
                sum-=nums[left];
                hm.remove(nums[left]);

                left++;
                right++;
            }
        }
        return max;
        
    }
}