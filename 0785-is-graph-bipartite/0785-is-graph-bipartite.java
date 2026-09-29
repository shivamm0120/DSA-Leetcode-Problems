class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int [] color=new int [n];

        Queue<Integer>q= new ArrayDeque<>();

     

        for(int j=0;j<n;j++){
            if(color[j]==0){
                q.offer(j);
                color[j]=1;


                while(!q.isEmpty()){
                    int node=q.poll();

                    for(int i=0;i<graph[node].length;i++){
                        int temp_color=color[graph[node][i]];

                        if(temp_color==color[node])return false;

                        if(temp_color==0){
                            if(color[node]==1)
                              color[graph[node][i]]=2;
                            else color[graph[node][i]]=1;

                            q.offer(graph[node][i]);

                         }
                    }

                }

            }
        }
        return true;
       
    }
  
}