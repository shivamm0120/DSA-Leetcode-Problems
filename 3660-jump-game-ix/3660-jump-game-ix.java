class Solution {
    public int[] maxValue(int[] nums) {
        int n= nums.length;

        int []pre=new int [n];
        int []suff=new int [n];
        int []res=new int [n];

        pre[0]=nums[0];
        suff[n-1]=nums[n-1];

        for(int i=1;i<n;i++){
            if(nums[i]>pre[i-1])
              pre[i]=nums[i];
             else pre[i]=pre[i-1];
        }
        for(int i=n-2;i>=0;i--){
            suff[i]=Math.min(nums[i],suff[i+1]);
        }

        res[n-1]=pre[n-1];//for last ele only 1 option is there to go for max element

        for(int i=n-2;i>=0;i--){
            if(pre[i]>suff[i+1]){//here if it is greater than suff at next i =>it means either this particular elem will be max or the ele at res[i+1],here if this i gives max ele in pre[i] then for i+1 also this ele will be maximum reachable .And if i+1 gives max ele then i am adding res[i+1]into res[i] 
                res[i]=res[i+1];
            }
            else res[i]=pre[i];//here if suff is greater =>it means we will not move right side and will go the max value till i


        }
        return res;
        
        
    }
}