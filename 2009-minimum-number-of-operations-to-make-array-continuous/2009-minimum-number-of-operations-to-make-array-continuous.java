class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);

       HashSet <Integer>hs= new HashSet<>();
       hs.add(nums[0]);
       int min_p=0,max_p=1;
       int min_op=Integer.MAX_VALUE;
       int window_size=0,dup=0;

       while(max_p<n){
         if(nums[max_p]-nums[min_p]<=n-1){
            hs.add(nums[max_p]);
            max_p++;
         }
         else{
            window_size=max_p-min_p;
            dup=window_size-hs.size();
            min_op=Math.min(min_op,n-window_size+dup);
            hs.remove((Integer)nums[min_p]);
            min_p++;
         }
       }
       if(max_p==n){
           window_size=max_p-min_p;
            dup=window_size-hs.size();
            min_op=Math.min(min_op,n-window_size+dup);
       }

        return (min_op==Integer.MAX_VALUE)?0:min_op;
        
    }
}