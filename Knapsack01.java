class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    int k[][] = new int[0][0];
    int kn(int W, int wt[], int val[], int n){
        if(n==0 || W==0){
            return 0;
        }
        if(k[n][W]!=-1){
            return k[n][W];
        }
        if(wt[n-1]<=W){
            return k[n][W] = Math.max(val[n-1]+kn(W-wt[n-1],wt,val,n-1),kn(W,wt,val,n-1));
        }
        return k[n][W] = kn(W,wt,val,n-1);
    }
    int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here 
         k = new int[n+1][W+1];
         for(int i=0;i<=n;i++){
             for(int j=0;j<=W;j++){
                 k[i][j] = -1;
             }
         }
         //k = new int[n+1][W+1];
         return kn(W,wt,val,n);
    } 
}


