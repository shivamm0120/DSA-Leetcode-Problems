class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        
        int max=piles[0];
        for(int i=1;i<n;i++){
            max=Math.max(max,piles[i]);

        }
        if(n==h)return max;
        int min_speed=1;
        int max_speed=max;
        int ans=0;
        while(min_speed<=max_speed){
            int mid =(min_speed+max_speed)/2;
            int count =findHrs(piles,mid);
            if(count<=h){
                ans=mid;
                max_speed=mid-1;
            }
            else min_speed=mid+1;
        }
        return ans;
    }
    static int findHrs(int []piles,int mid){
        int count=0;
        for (int i=0;i<piles.length;i++){
            count +=Math.ceil(piles[i]/(double)mid);
        }
        return count ;
    }
}