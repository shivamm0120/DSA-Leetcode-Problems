class Solution {
    public int countIntersectingIntervals(int[][] intervals) {
        int count=0;
        
        for(int i=0;i<intervals.length-1;i++){
            int start=intervals[i][0];
            int end=intervals[i][1];
            
            for(int j=i+1;j<intervals.length;j++){
                int newStart=intervals[j][0];
                int newEnd=intervals[j][1];

                if(newStart <=end && newEnd>=start)
                    count++;
                
            }
        }
        return count;
        
    }
}