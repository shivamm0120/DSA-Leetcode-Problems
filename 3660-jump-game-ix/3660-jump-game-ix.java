class Solution {
    public int[] maxValue(int[] nums) {
        int n= nums.length ,min=nums[n-1];

        int []max=new int [n];
        max[0]=nums[0];

        for(int i=1;i<n;i++){
            max[i]=Math.max(nums[i],max[i-1]);
        }
         
        for(int i=n-2;i>=0;i--){
            min=Math.min(min,nums[i+1]);
            
            if(max[i]>min)max[i]=max[i+1];
        }
        

        
      return max;  
        
    }
}