class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m= matrix.length;
        int n=matrix[0].length;

        int low_row=0;int high_row=m-1;
        while(low_row<=high_row){
            int mid=(low_row+high_row)/2;
            if(matrix[mid][n-1]==target)return true;
            if(matrix[mid][n-1]<target){
                low_row=mid+1;
                if(low_row>=m)return false;
            }
            else high_row=mid-1;    

        }
        return findTarget(matrix[low_row],target);
        
    }

    boolean findTarget(int []nums,int target){
        int low=0;int high=nums.length;
        while(low<=high){
            int mid =(low+high)/2;
            if(nums[mid]==target)return true;
            if(nums[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return false;
    }
}