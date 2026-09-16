class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int max=-1;
        int profit=0;

        for(int i=n-2;i>=0;i--){
            max=Math.max(max,prices[i+1]);
            profit=Math.max(profit,max-prices[i]);
            
        }
        return profit;

       
        
    }
}