class Solution {
    long dp[][] = new long[0][0];
    public long num(int steps, int arrLen, int i){
        if(i<0 || i>=arrLen){
            return 0;
        }
        if(steps==0){
            if(i==0){
                return 1;
            }
            return 0;
        }
        if(dp[i][steps]!=-1){
            return dp[i][steps];
        }
        
        return dp[i][steps] = (num(steps-1,arrLen,i+1)+num(steps-1,arrLen,i-1)+num(steps-1,arrLen,i))%((int)Math.pow(10,9)+7);
    }
    public int numWays(int steps, int arrLen) {
        arrLen = Math.min(arrLen,steps/2+1);
        dp = new long[arrLen][steps+1];
        for(int i=0;i<arrLen;i++){
            for(int j=0;j<=steps;j++){
                dp[i][j] = -1;
            }
        }
        long n  = num(steps,arrLen,0);
        int res = (int)n%((int)Math.pow(10,9)+7);
        return res;
    }
}