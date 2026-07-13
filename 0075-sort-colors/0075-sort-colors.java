class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int zeroes=0,twos=n-1;

        int i=0;
        while(i<=twos){
            if(nums[i]==0){
                swap(nums,zeroes,i);
                zeroes++;
            }
            else if(nums[i]==2){
                swap(nums,twos,i);
                twos--;
                continue;
            }
            i++;
        }
      
    }
    void swap(int []nums,int k,int i){
        if(i==k)return;
        int temp=nums[k];
        nums[k]=nums[i];
        nums[i]=temp;
    }
}