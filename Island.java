class Solution {
    public boolean isSafe(int n, int m, int i, int j){
        if(i<0 || i>=n){
            return false;
        }
        if(j<0 || j>=m){
            return false;
        }
        return true;
    }
    public void island(char[][] grid, int n, int m, int i, int j){
        if(isSafe(n,m,i,j) && grid[i][j]=='1'){
            grid[i][j] = 0;
            island(grid,n,m,i+1,j);
            island(grid,n,m,i,j+1);
            island(grid,n,m,i-1,j);
            island(grid,n,m,i,j-1);
        }
    }
    public int numIslands(char[][] grid) {
        int count = 0;
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    count++;
                    island(grid,n,m,i,j);
                }
            }
        }
        if(count==0){
            return count;
        }
        return count;
    }
}
