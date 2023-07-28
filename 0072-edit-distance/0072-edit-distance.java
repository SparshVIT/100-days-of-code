class Solution {
    int dp[][] = new int[0][0];
    public int minD(String word1, String word2, int m, int n){
        if(m==0){
            return n;
        }
        if(n==0){
            return m;
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        if(word1.charAt(m-1)==word2.charAt(n-1)){
            return dp[m][n] = minD(word1,word2,m-1,n-1);
        }
        int a = minD(word1,word2,m-1,n);
        int b = minD(word1,word2,m,n-1);
        int c = minD(word1,word2,m-1,n-1);
        int min  = Math.min(a,b);
        return dp[m][n] = 1+Math.min(min,c);
    }
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        dp = new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                dp[i][j] = -1;
            }
        }
        return minD(word1,word2,m,n);
    }
}