//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])
    {
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking number of testcases
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            //taking number of steps in stair
            int n = sc.nextInt();
            
            //calling method countWays() of class Hops
            System.out.println(new Solution().countWays(n));
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to count the number of ways in which frog can reach the top.
    long dp[] = new long[0];
    int mod = (int)Math.pow(10,9)+7;
    long count(int n){
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n] = (count(n-1)%mod)+(count(n-2)%mod)+(count(n-3)%mod);
    }
    long countWays(int n)
    {
        // add your code here
        dp = new long[n+1];
        for(int i=0;i<=n;i++){
            dp[i] = -1;
        }
        return count(n)%mod;
    }
    
}

