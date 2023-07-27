class Solution {
    int dp[][] = new int[0][0];
    public int lcs(String w1, String w2, int m, int n){
        if(m==0||n==0){
            return 0;
        }
        if(w1.charAt(m-1)==w2.charAt(n-1)){
            return 1+lcs(w1,w2,m-1,n-1);
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        return dp[m][n] = Math.max(lcs(w1,w2,m-1,n),lcs(w1,w2,m,n-1));
  }
    public int minDistance(String word1, String word2) {
        if(word1.equals(word2)){
            return 0;
        }
        dp = new int[word1.length()+1][word2.length()+1];
        for(int i=0;i<=word1.length();i++){
            for(int j=0;j<=word2.length();j++){
                dp[i][j] = -1;
            }
        }
        int d = lcs(word1,word2,word1.length(),word2.length());
        if(d==0){
            return word1.length()+word2.length();
        }
        int sub = Math.abs((word1.length()-d))+Math.abs((word2.length()-d));
        return sub;
    }
}