class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
    //     long max=0;
    //     long sum=0;

    //     int n=nums.length;
    //     int left=0,right=0;
    //    // HashMap<Integer,Integer>hm=new HashMap<>();

    //     // while(right<n){
    //     //     int curr=nums[right];
    //     //     if(hm.containsKey(curr)){
    //     //         int duplicate=hm.get(curr);
    //     //         while(left<=duplicate){
    //     //             sum-=nums[left];
    //     //             hm.remove(nums[left]);
    //     //             left++;
    //     //         }
    //     //     }
    //     //     int windowSize=right-left+1;

    //     //     hm.put(curr,right);
    //     //     sum+=curr;
    //     //     if(windowSize<k){
    //     //         right++;
    //     //     }
    //     //     if(windowSize==k){
    //     //         if(max<sum)max=sum;
    //     //         sum-=nums[left];
    //     //         hm.remove(nums[left]);

    //     //         left++;
    //     //         right++;
    //     //     }
    //     // }
    //    HashSet<Integer>elements=new HashSet<>();

    //     while(right<n){
    //         if(!elements.contains(nums[right])){
    //             int window=right-left+1;
    //             elements.add(nums[right]);
    //             sum+=nums[right];

    //             if(window<k){
    //                 right++;
    //             }
    //             else if(window==k){
    //                if(max<sum)max=sum;
    //                sum-=nums[left];
    //                elements.remove(nums[left]);
    //                left++;
    //                right++;
    //             }

    //         }
    //         else{
    //             while(nums[left]!=nums[right]){
    //                 sum-=nums[left];
    //                  elements.remove(nums[left]);
    //                 left++;
    //             }
    //             sum-=nums[left];
    //             elements.remove(nums[left]);
    //             left++;

    //         }

    //     }
    //     return max;

       int n = nums.length;
        Set<Integer> elements = new HashSet<>();
        long currentSum = 0;
        long maxSum = 0;
        int begin = 0;
        
        for (int end = 0; end < n; end++) {
            if (!elements.contains(nums[end])) {
                currentSum += nums[end];
                elements.add(nums[end]);
                
                if (end - begin + 1 == k) {
                    maxSum = Math.max(maxSum, currentSum);
                    currentSum -= nums[begin];
                    elements.remove(nums[begin]);
                    begin++;
                }
            } else {
                while (nums[begin] != nums[end]) {
                    currentSum -= nums[begin];
                    elements.remove(nums[begin]);
                    begin++;
                }
                begin++;
            }
        }
        
        return maxSum;
        
    }
}