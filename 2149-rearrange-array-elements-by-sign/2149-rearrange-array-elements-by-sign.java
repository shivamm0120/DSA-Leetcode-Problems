class Solution {
    public int[] rearrangeArray(int[] nums) {
       int even=0;int odd=1;
       int n=nums.length;
       int []ans= new int [n];
       for(int num:nums){
        //for +ve elements
        if(num>0){
            ans[even]=num;
            even+=2;
        }
        else {
            ans[odd]=num;
            odd+=2;
            }

       }
       return ans;
    }
}
//In the above question if order doesnot matters then we can do it without using an extra array.we can do in place.
//i can use swapping of the elements where the alternate order is not there
/*int pos=0,neg=1;

while(pos<n && neg<n){
  if(nums[pos]>0) pos+=2;
  else if(nums[neg]<0)neg+=2;
  else{
  int temp=nums[pos];
  nums[pos]=nums[neg];
  nums[neg]=temp;
  }
}
return nums;

*/
