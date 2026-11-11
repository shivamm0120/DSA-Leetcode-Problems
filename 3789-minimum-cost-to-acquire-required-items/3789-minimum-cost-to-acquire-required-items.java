class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long totalcost=0;

        int commonNeed=Math.min(need1,need2);
        int diff=Math.abs(need2-need1);

        if((long)cost1+cost2<costBoth){
            totalcost= (long)commonNeed*cost1 + (long) commonNeed*cost2;
            if(diff>0){
                if(need1>need2)
                   totalcost+=(long)diff*cost1;
                else totalcost+=(long) diff*cost2;
            }

        }
        else {
            totalcost= (long)commonNeed*costBoth;
            if(diff>0){
                if(need1>need2){
                    totalcost=totalcost+ (long)Math.min(cost1,costBoth)*diff;
                }
                else totalcost=totalcost+ (long)Math.min(cost2,costBoth)*diff;

            }

        }
        return totalcost;
    }
}