class Solution {
    int dp[] = new int[0];
    int mod = (int)Math.pow(10,9)+7;
    public int cg(int length, int low, int high, int zero, int one){
        if(length>high){
            return 0;
        }
        if(dp[length]!=-1){
            return dp[length];
        }
        if(low<= length && length<=high){
            dp[length] =  1;
        }
        else{
            dp[length] = 0;
        }
        dp[length] = dp[length]  + cg(length+zero,low,high,zero,one)%mod;
        dp[length] = dp[length] + cg(length+one,low,high,zero,one)%mod;
        return dp[length];
    }
    public int countGoodStrings(int low, int high, int zero, int one) {
        dp = new int[high+1];
        for(int i=0;i<=high;i++){
            dp[i] = -1;
        }
        return cg(0,low,high,zero,one)%mod;
    }
}