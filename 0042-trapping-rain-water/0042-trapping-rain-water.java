class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int trap=0;

        int[]leftMax=new int [n];
        int [] rightMax=new int[n];

        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i-1],leftMax[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i+1],rightMax[i+1]);
        }

        for(int i=0;i<n;i++){
            int minWall=Math.min(leftMax[i],rightMax[i]);
            if(height[i]<=minWall){
                trap=trap+(minWall-height[i]);
            }

        }
        return trap;
        
    }
}