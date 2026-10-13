class Solution {
    public long maxAlternatingSum(int[] nums) {

        int n=nums.length;
        int maxCount=0;
        maxCount=(n%2==0)?n/2:n/2+1;
        long result=0;

        int count=1;

        Arrays.sort(nums);
        int i=0,j=n-1;

        while(i<=j){
            if(Math.abs(nums[i])<Math.abs(nums[j])){
                int contribute=nums[j]*nums[j];
                if(count<=maxCount){
                    result+=contribute;
                    count++;
                }
                else result-=contribute;
                j--;
            }
            else{
                int contribute=nums[i]*nums[i];
                if(count<=maxCount){
                    result+=contribute;
                    count++;
                }
                else result-=contribute;
                i++;

            }
        }
        return result;
        
    }
}