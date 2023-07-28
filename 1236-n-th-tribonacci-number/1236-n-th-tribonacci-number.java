class Solution {
    int dp[] = new int[0];
    public int trio(int n){
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n] = trio(n-1)+trio(n-2)+trio(n-3);
    }
    public int tribonacci(int n) {
        dp = new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i] = -1;
        }
        return trio(n);
    }
}