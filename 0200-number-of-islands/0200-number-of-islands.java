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
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length ||grid[i][j]=='0' || visited[i][j])
            return ;

        //mark it as visited
        visited[i][j]=true;

        //go through each direction
        dfs(i,j-1,grid,visited);
        dfs(i,j+1,grid,visited);
        dfs(i-1,j,grid,visited);
        dfs(i+1,j,grid,visited);

        return;
    }
}