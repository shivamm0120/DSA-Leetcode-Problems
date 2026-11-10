class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        int[]arr=new int[n];
        int i=n-1;

        while(left<=right){
            if(Math.abs(nums[left])<Math.abs(nums[right])){
                arr[i]=nums[right]*nums[right];
                right--;
            }
            else{
                arr[i]=nums[left]*nums[left];
                left++;

            }
            i--;

        }
        return arr;
        
    }
}