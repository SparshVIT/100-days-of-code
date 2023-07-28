class Solution{
    int dp[][] = new int[0][0];
    int uk(int N, int W, int val[], int wt[]){
        if(N==0 || W==0){
            return 0;
        }
        if(dp[N][W]!=-1){
            return dp[N][W];
        }
        if(wt[N-1]<=W){
            return dp[N][W] = Math.max(val[N-1]+uk(N,W-wt[N-1],val,wt), uk(N-1,W,val,wt));
        }
        return dp[N][W] = uk(N-1,W,val,wt);
    }
    int knapSack(int N, int W, int val[], int wt[])
    {
        // code here
        dp = new int[N+1][W+1];
        for(int i=0;i<=N;i++){
            for(int j=0;j<=W;j++){
                dp[i][j] = -1;
            }
        }
        return uk(N,W,val,wt);
    }
}
