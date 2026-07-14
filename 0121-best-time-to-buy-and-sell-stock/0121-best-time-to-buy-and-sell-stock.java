class Solution {
    public int maxProfit(int[] prices) {
        int buy_price=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
           buy_price=Math.min(buy_price,prices[i]);
           profit=Math.max(profit,prices[i]-buy_price);
        }
        return profit;
        
    }
}