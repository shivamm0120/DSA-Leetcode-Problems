class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int []ans = new int[n];

        int l_count=0,same=0;
        for(int num:nums){
            if(num<pivot)
            l_count++;
            if(num==pivot)
              same++;
        }

        int less=0;int high =l_count+same;

        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
               ans[less]=nums[i];
               less++;
            }
            else if(nums[i]==pivot &&same>0){
                ans[l_count+same-1]=pivot;
                same--;

            }
            else {
                ans[high]=nums[i];
                high++;
            }
        }
        return ans;
        
    }
}