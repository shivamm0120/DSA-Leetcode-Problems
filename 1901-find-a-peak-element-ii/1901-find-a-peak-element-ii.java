class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;

        int low=0,high=n-1;
        while(low<=high){
            int mid =(low+high)/2;
            int row=findMax(mat,n,m,mid);
            int value=mat[row][mid];

            int left=(mid>0)?mat[row][mid-1]:-1;
            int right=(mid<n-1)?mat[row][mid+1]:-1;

            if(value>left && value>right) return new int []{row,mid};
            if(value<right)low=mid+1;
            else high=mid-1;
        }
        return null;
    }
    int findMax(int [][]mat,int n, int m,int mid ){
        int max=0;
        for(int i=0;i<m;i++){
            if(mat[max][mid]<mat[i][mid]){
                max=i;
            }
        }
        return max;
    }
}