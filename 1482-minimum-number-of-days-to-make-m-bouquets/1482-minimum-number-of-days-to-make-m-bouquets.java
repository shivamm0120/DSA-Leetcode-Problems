class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;

        if((long)m*k>n)return -1;
        int max=bloomDay[0],min=bloomDay[0];
        for(int i=1;i<n;i++){
            min=Math.min(bloomDay[i],min);
            max=Math.max(bloomDay[i],max);
        }
        while(min<=max){
            int mid =min+(max-min)/2;
            int bouquets=bouquetsCount(bloomDay,mid,k,m);
            if(bouquets>=m){
                max=mid-1;
            }
            else min=mid+1;
        }
        return min;
    }
   static int bouquetsCount(int[] bloomDay,int mid,int k,int m){
        int count=0; int flowers=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid ){
                flowers++;
                if(flowers==k){
                    count++;
                    flowers=0;
                }
            }
            else {
                flowers=0;
            }
        }
        return count;
    }
}