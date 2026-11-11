class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;

        int total=0;

        while(left<right){
            int trap=Math.min(height[left],height[right])*(right-left);
            total=Math.max(total,trap);

            if(height[left]<height[right])left++;
            else right--;
        }
        return total;
    }
}