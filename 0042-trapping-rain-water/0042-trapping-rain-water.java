class Solution {
    public int trap(int[] height) {
        int lMax=0,rMax=0,trap=0;

        int l=0,r=height.length-1;
        while(l<r){
            if(height[l]<=height[r]){
                if(lMax>=height[l])
                    trap+=lMax-height[l];
                
                else lMax=height[l];
                l++;
            }
            else{
                if(rMax>=height[r])
                  trap+=rMax-height[r];
                else  rMax=height[r];
                r--;
            }
        }
        return trap;
        
    }
}