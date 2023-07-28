class Solution {
    int dp[][] = new int[0][0];
    public int minPath(int[][] grid, int N, int M){
        if(N<0 || M<0){
            return 999999;
        }
        if(N==0 && M==0){
            return grid[0][0];
        }
        if(dp[N][M]!=-1){
            return dp[N][M];
        }
        return dp[N][M] = Math.min((grid[N][M]+minPath(grid,N-1,M)),(grid[N][M]+minPath(grid,N,M-1)));
        
    }
    public int minPathSum(int[][] grid) {
        dp = new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                dp[i][j] = -1;
            }
        }
        return minPath(grid,grid.length-1,grid[0].length-1);
    }
}