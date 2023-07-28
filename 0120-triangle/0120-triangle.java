class Solution {
    int dp[][] = new int[0][0];
    public int minsum(List<List<Integer>> triangle, int i, int j){
        if(i>=triangle.size()){
            return 0;
        }
        if(j>=triangle.get(i).size()){
            return 99999;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        return dp[i][j] = Math.min(triangle.get(i).get(j)+minsum(triangle,i+1,j),triangle.get(i).get(j)+minsum(triangle,i+1,j+1));
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        dp = new int[triangle.size()][triangle.get(triangle.size()-1).size()];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        return minsum(triangle,0,0);
    }
}