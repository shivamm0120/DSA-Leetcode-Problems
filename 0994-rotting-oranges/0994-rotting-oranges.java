class Node{
    int row;
    int col;
   // int time;
    Node(int row,int col){
        this.row=row;
        this.col=col;
        //this.time=time;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int minutes=-1;

        int [][] visited=new int[m][n];
        Deque<Node> q = new ArrayDeque<>();

        int freshCount=0;

//Take all the starting nodes in queue
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.offer(new Node(i,j));
                    visited[i][j]=2;
                }
                if(grid[i][j]==1)freshCount++;
            }
        }


        int[]drow={-1,0,1,0};
        int[]dcol={0,1,0,-1};

        int count=0;
        while(!q.isEmpty()){
            int size=q.size();
            minutes++;

            for(int i=1;i<=size;i++){
                Node node=q.poll();

                int row=node.row;
                int col=node.col;

                for(int j=0;j<4;j++){
                    int nrow=row+drow[j];
                    int ncol=col+dcol[j];

                    if(nrow<0 || nrow>=m || ncol<0 ||ncol>=n ||
                         visited[nrow][ncol]==2)continue;

                    if(grid[nrow][ncol]==1){
                        q.offer(new Node(nrow,ncol));
                        visited[nrow][ncol]=2;
                        count++;
                    }
                }
            }
           // minutes++;
        }
        if(count!=freshCount)return -1;
        return minutes==-1 ? 0 : minutes;
    }
}