class Solution
{
    int dp[][] = new int[0][0];
    public int mino(String str1, String str2, int m, int n){
        if(m==0){
            return n;
        }
        if(n==0){
            return m;
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        if(str1.charAt(m-1)==str2.charAt(n-1)){
            return dp[m][n] =  mino(str1,str2,m-1,n-1);
        }
        return dp[m][n] = 1+Math.min(mino(str1,str2,m,n-1),mino(str1,str2,m-1,n));
    }
	public int minOperations(String str1, String str2) 
	{ 
	    // Your code goes here
	    dp = new int[str1.length()+1][str2.length()+1];
	    for(int i=0;i<dp.length;i++){
	        for(int j=0;j<dp[0].length;j++){
	            dp[i][j] = -1;
	        }
	    }
	    return mino(str1,str2,str1.length(), str2.length());
	} 
}
