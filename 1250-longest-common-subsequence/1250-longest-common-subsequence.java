class Solution {
    int dp[][] = new int[0][0];
    public int lcs(String s1,String s2, int m, int n){
        if(m==0||n==0){
            return 0;
        }
        if(s1.charAt(m-1)==s2.charAt(n-1)){
            return 1+lcs(s1,s2,m-1,n-1);
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        return dp[m][n] =  Math.max(lcs(s1,s2,m-1,n),lcs(s1,s2,m,n-1));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int l1 = text1.length();
        int l2 = text2.length();
        dp = new int[l1+1][l2+1];
        for(int i=0;i<=l1;i++){
            for(int j=0;j<=l2;j++){
                dp[i][j] = -1;
            }
        }
        return lcs(text1,text2,l1,l2);
    }
}