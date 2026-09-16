class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int islands=0;

        boolean[][] visited=new boolean[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    islands++;
                    dfs(i,j,grid,visited);
                }
            }
        }
        return islands;
        
    }
    void dfs(int i,int j,char[][]grid,boolean[][] visited){
        visited[i][j]=true;

        if(j!=0 && !visited[i][j-1] && grid[i][j-1]=='1')
        dfs(i,j-1,grid,visited);

        if(j!=grid[0].length-1 && !visited[i][j+1] && grid[i][j+1]=='1')
        dfs(i,j+1,grid,visited);

        if(i!=0 && !visited[i-1][j] && grid[i-1][j]=='1')dfs(i-1,j,grid,visited);
        if(i!=grid.length-1 && !visited[i+1][j] && grid[i+1][j]=='1')dfs(i+1,j,grid,visited);
        return;
    }
}