class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);

       ArrayList<Integer>al= new ArrayList<>();
        al.add(nums[0]);
        int pointer=1;

        for(int curr=1;curr<n;curr++){
            
            int prev=curr-1;

            if(nums[curr]!=nums[prev])
              al.add(nums[curr]);
        }

        int left=0,right=1;
        int maxDistinct=1;

       while(right<al.size()){
            boolean validRange=al.get(right)-al.get(left)<=n-1;
            if(validRange)
               right++;
             else {
                maxDistinct=Math.max(maxDistinct,right-left);
                left++;
             }  
        }
       maxDistinct= Math.max(maxDistinct,right-left);
       return n-maxDistinct;
    }
}