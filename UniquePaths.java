class Solution {
    int count = 0;
    int dp[][] = new int[0][0];
    public int paths(int i, int j, int m, int n){
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(i>=m || j>=n){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        return dp[i][j] = paths(i+1,j,m,n) + paths(i,j+1,m,n);
        
    }
    public int uniquePaths(int m, int n) {
        dp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j] = -1;
            }
        }
        return paths(0,0,m,n);
    }
}
