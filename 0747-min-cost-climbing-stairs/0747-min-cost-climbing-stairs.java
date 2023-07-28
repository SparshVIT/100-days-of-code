class Solution {
    int dp[] = new int[0];
    public int minCost(int[] cost, int d){
        if(d>=cost.length){
            return 0;
        }
        if(dp[d]!=-1){
            return dp[d];
        }
        return dp[d] = Math.min(cost[d]+minCost(cost,d+1), cost[d]+minCost(cost,d+2));
    }
    public int minCostClimbingStairs(int[] cost) {
        dp  = new int[cost.length];
        for(int i=0;i<cost.length;i++){
            dp[i] = -1;
        }
        int a = minCost(cost,0);
        for(int i=0;i<cost.length;i++){
            dp[i] = -1;
        }
        int b = minCost(cost,1);
        return  Math.min(a,b);
    }
}