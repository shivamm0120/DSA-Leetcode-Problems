class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int index=-1;

        //find the longest common prefix =>means index from where i can get the next greater number(permutation)
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                System.out.println("yes");
                break;
            }
        }
        //when index is -1 ,it means that there is no any element at index i which is lesser than i+1 .In other words array is in decreasing order .So in this case we didnot find any index that can be changed by some bigger no.
        //if we change any no by other no then we will get smaller value ..but it should be greater . Ex- [5,4,3,2]

        if (index==-1)
          reverse(nums,0,n-1);//As ques demands give 1st smallest permutation in this case
          
        else{

        for(int i=n-1;i>index;i--){
            if(nums[i]>nums[index]){
                swap(nums,index,i);
                break;
            }
        }

        reverse(nums,index+1,n-1);
        }

        
    }
    void reverse(int [] nums,int left,int right){
        while(left<right){
            swap(nums,left,right);
            left++;
            right--;
        }
    }
    void swap(int []nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}