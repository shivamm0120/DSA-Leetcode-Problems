class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n =matrix[0].length;

        int row=0,col=n-1;
        while(row<=m-1 &&col>=0){
            int value=matrix[row][col];
            if(value==target)return true;
            if(value<target)row++;
            else col--;

        }

        return false;
        
    }
}