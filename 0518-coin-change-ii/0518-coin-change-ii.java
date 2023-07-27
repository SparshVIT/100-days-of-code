class Solution {
   int dp[][] = new int[0][0];
    public int count(int[] arr, int d, int sum){
        if(sum<0){
            return 0;
        }
        if(sum==0){
            return 1;
        }
        if(d==0){
            return 0;
        }
        if(dp[d][sum]!=-1){
            return dp[d][sum];
        }
        return dp[d][sum] = count(arr,d,sum-arr[d-1])+count(arr,d-1,sum);
    }
    public int change(int amount, int[] coins) {
        dp = new int[coins.length+1][amount+1];
        for(int i=0;i<=coins.length;i++){
            for(int j=0;j<=amount;j++){
                dp[i][j] = -1;
            }
        }
        return count(coins,coins.length,amount);
    }
}