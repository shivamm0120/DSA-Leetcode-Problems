class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
       
        Deque<Integer>stack= new ArrayDeque<>();

        for(int i=0;i<n;i++){

            while(!stack.isEmpty()&& (stack.peek()>0 && asteroids[i]<0)){
                int incomingSize=Math.abs(asteroids[i]);
                if(stack.peek()>incomingSize){
                    asteroids[i]=0;break;
                }
                else if(stack.peek()<incomingSize){
                    stack.pop();
                }
                else {
                    asteroids[i]=0;
                    stack.pop();
                }
            }
            if(asteroids[i]!=0)stack.push(asteroids[i]);

        }
        
        //create ans array that can be returned
       int []ans= new int[stack.size()];
       for(int i=ans.length-1;i>=0;i--){
        ans[i]=stack.pop();
       }
       return ans;

        
        
    }
}