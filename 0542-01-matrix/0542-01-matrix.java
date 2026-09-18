class Pair{
    int row;
    int col;

    Pair(int row,int col){
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;

        int[][]visited=new int[m][n];
        int[][]answer=new int[m][n];


        Queue<Pair>q=new ArrayDeque<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
              if(mat[i][j]==0){
                q.offer(new Pair(i,j));
                visited[i][j]=1;
              }
            }
        }

        while(!q.isEmpty()){
            Pair p=q.poll();
            int row=p.row;
            int col=p.col;

            int[]drow={-1,0,1,0};
            int[]dcol={0,1,0,-1};

            for(int i=0;i<4;i++){
                int nrow=row+drow[i];
                int ncol=col+dcol[i];

                if(nrow<0 ||ncol<0 ||nrow>=m ||ncol>=n)
                   continue;
                if(visited[nrow][ncol]!=1){
                    q.offer(new Pair(nrow,ncol));
                    visited[nrow][ncol]=1;
                    answer[nrow][ncol]=answer[row][col]+1;

                }
            }

        }
        return answer;


    }
}