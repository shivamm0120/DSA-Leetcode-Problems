class Solution {
        
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int[]color=new int [n];

        Queue<Integer>q=new ArrayDeque<>();
        q.offer(0);
        color[0]=1;
        for(int i=0;i<n;i++){
            if(color[i]==0){
             color[i]=1;
             q.offer(i);
            }
        
        while(!q.isEmpty()){
            int node=q.poll();

            for(int v=0;v<graph[node].length;v++){
                int adj=graph[node][v];
               
                //if not colored
                if(color[adj]==0){
                  if(color[node]==1){
                    color[adj]=2;
                    q.offer(adj);
                  }
                  else if(color[node]==2){
                    color[adj]=1;
                    q.offer(adj);
                  }
                }


                //if colored
                else {
                    if(color[node]==color[adj])return false;
                }
            }

        }
        }
        return true;
    }

}