class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] graph=new ArrayList[numCourses];
        int[] visited=new int[numCourses];

        for(int i = 0; i < numCourses; i++)
            graph[i] = new ArrayList<>();
        
        for(int[] p :prerequisites){
            graph[p[0]].add(p[1]);

        }

        for(int i=0;i<numCourses;i++){
            if(visited[i]==0){
               if(!finishCourse(i,graph,visited))return false;
            }
        }
        return true;
    }


    boolean finishCourse(int i,List<Integer>[] graph,int[]visited){
         if(visited[i]==1)return false;
         visited[i]=1;
         
        for(int prerequisite:graph[i]){
            if(visited[prerequisite]!=2)
              if(!finishCourse(prerequisite,graph,visited))return false;
        }
        visited[i]=2;
        return true;
    }
}