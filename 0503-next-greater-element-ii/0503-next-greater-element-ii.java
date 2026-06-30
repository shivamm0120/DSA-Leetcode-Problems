class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n= nums.length;
        int [] nextGreater= new int [n];

        Stack <Integer>stack= new Stack<>();
        int x=2;
        while(x>0){
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty()&&stack.peek()<=nums[i]){
                stack.pop();
            }
           nextGreater[i]= stack.isEmpty()?-1:stack.peek();
           stack.push(nums[i]);
           
        }
        x--;
        }
        return nextGreater;
        
    }
}