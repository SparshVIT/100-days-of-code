class Solution {
    int dp[] = new int[0];
    public int fibo(int n){
        if(n<=1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n] = fibo(n-1)+fibo(n-2);
    }
    public int fib(int n) {
        dp = new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i] = -1;
        }
        return fibo(n);
    }
}