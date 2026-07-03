class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        int []size= new int [n];
        for(int i=0;i<n;i++){
            size[i]=Math.abs(asteroids[i]);
        }
        Deque<Integer>stack= new ArrayDeque<>();

        for(int i=0;i<n;i++){

            while(!stack.isEmpty()&& (stack.peek()>0 && asteroids[i]<0)){
                if(stack.peek()>size[i]){
                    size[i]=0;break;
                }
                else if(stack.peek()<size[i]){
                    stack.pop();
                }
                else {
                    size[i]=0;
                    stack.pop();
                }
            }
            if(size[i]!=0)stack.push(asteroids[i]);

        }

       int []ans= new int[stack.size()];
       for(int i=ans.length-1;i>=0;i--){
        ans[i]=stack.pop();
       }
       return ans;

        
        
    }
}