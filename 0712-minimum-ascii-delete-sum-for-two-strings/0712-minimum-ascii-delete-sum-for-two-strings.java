class Solution {
    int dp[][] = new int[0][0];
    public int minD(String s1, String s2, int m, int n){
        //System.out.println(c);
        if(m==0){
            //System.out.println(s2.substring(0,n));
            int c = 0;
            for(int i=0;i<n;i++){
                c = c+(int)s2.charAt(i);
            }
            return c;
        }
        if(n==0){
            //System.out.println(s1.substring(0,m));
            int c = 0;
            for(int i=0;i<m;i++){
                c = c+(int)s1.charAt(i);
            }
            return c;
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        if(s1.charAt(m-1)==s2.charAt(n-1)){
            return dp[m][n] = minD(s1,s2,m-1,n-1);
        }
        return dp[m][n] = Math.min((int)s1.charAt(m-1)+minD(s1,s2,m-1,n),(int)s2.charAt(n-1)+minD(s1,s2,m,n-1));
    }
    public int minimumDeleteSum(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        dp = new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                dp[i][j] = -1;
            }
        }
        
        return minD(s1,s2,m,n);
    }
}