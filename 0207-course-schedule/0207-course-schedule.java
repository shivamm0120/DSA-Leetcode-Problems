class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] graph=new ArrayList[numCourses];

        //0->not processed,not completed(unvisited)
        //1->processed but not completed(visiting)
        //2->completed(visited)
        int[] visited=new int[numCourses];

        for(int i = 0; i < numCourses; i++)
            graph[i] = new ArrayList<>();

        //create adjacency list
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
        //if u are visiting the same course again=>it means there is cycle.
        //bcz if its prerequisites had completed then it should not be 1
        //Means u r checking same course again 
         if(visited[i]==1)return false;
         visited[i]=1;
         
        for(int prerequisite:graph[i]){
            //if already completed then dont go to complete it
            //if not,then first finish the prerequisite:
            if(visited[prerequisite]!=2)
              if(!finishCourse(prerequisite,graph,visited))return false;
        }
        visited[i]=2;
        return true;
    }
}