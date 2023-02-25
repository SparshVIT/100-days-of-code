class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int min_number = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min_number){
                min_number = prices[i];
            }
            else if(prices[i]-min_number>max_profit){
                max_profit = prices[i]-min_number;
            }
        }
        return max_profit;
    }
}
