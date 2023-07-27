class Solution {
    int dp[][] = new int[0][0];
    public int cross(int[] nums1, int[] nums2, int m, int n){
        if(m==0||n==0){
            return 0;
        }
        if(nums1[m-1]==nums2[n-1]){
            return 1+cross(nums1,nums2,m-1,n-1);
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        return dp[m][n] = Math.max(cross(nums1,nums2,m-1,n),cross(nums1,nums2,m,n-1));
    }
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        dp = new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                dp[i][j] = -1;
            }
        }
        return cross(nums1,nums2,m,n);
    }
}