class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> freq= new HashMap<>();

        int n=nums.length;
        for(int i=0;i<n;i++){
         int count= freq.getOrDefault(nums[i],1);
         System.out.println(nums[i]+" "+ count +"times");
         if(count>n/2)return nums[i];
         freq.put(nums[i],count+1);
        }
        return -1;
    }
}