class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int min=weights[0],max=0;
        for(int weight:weights){
            min=Math.max(min,weight);
            max+=weight;
        }
        while(min<=max){
            int mid =(min+max)/2;
            int req_days=countDays(weights,mid);
            if(req_days<=days){
                max=mid-1;
            }
            else min=mid+1;
        }
        return min;
        
    }
    static int countDays(int []weights,int mid){
        int count=1;int total=0;
        for(int weight:weights){
            if(total+weight>mid){
                count++;
                total=weight;
            }
            else total+=weight;

           
        }
        return count;
    }
}