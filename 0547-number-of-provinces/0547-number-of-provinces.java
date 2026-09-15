class Solution {
    public int findCircleNum(int[][] isConnected) {
        int provinces=0;
        int n=isConnected.length;

        int[]visited=new int[n+1];

        for(int i=1;i<=n;i++){
            if(visited[i]!=1){
                provinces++;
                dfs(visited,i,isConnected);
            }
        }
        return provinces;
        
    }
    void dfs(int[]visited,int node,int[][]adj){
        visited[node]=1;
        for(int i=1;i<=adj.length;i++){
            if(adj[node-1][i-1]==1 && visited[i]==0){
                dfs(visited,i,adj);
            }
        }
    }
}