//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S = br.readLine().trim().split(" ");
            int n = Integer.parseInt(S[0]);
            int m = Integer.parseInt(S[1]);
            int s = Integer.parseInt(S[2]);
            int d = Integer.parseInt(S[3]);
            int[][] edges = new int[m][2];
            for(int i = 0; i < m; i++){
                String[] S1 = br.readLine().trim().split(" ");
                edges[i][0] = Integer.parseInt(S1[0]);
                edges[i][1] = Integer.parseInt(S1[1]);
            }
            Solution obj = new Solution();
            int ans = obj.possible_paths(edges, n, s, d);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    int dp[] = new int[0];
    public int possible(ArrayList<ArrayList<Integer>> a, int d, int s, int dt){
        if(d>=a.size()){
            return 0;
        }
        if(d==dt){
            return 1;
        }
        if(dp[d]!=-1){
            return dp[d];
        }
        int temp = 0;
        for(int i=0;i<a.get(d).size();i++){
            temp += possible(a,a.get(d).get(i),s,dt);
        }
        return dp[d] = temp;
    }
    public int possible_paths(int[][] edges, int n, int s, int d)
    {
        // Code here 
        dp = new int[n];
        for(int i=0;i<n;i++){
            dp[i] = -1;
        }
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int d1 = edges[i][0];
            int d2 = edges[i][1];
            a.get(d1).add(d2);
        }
        return possible(a,s,s,d);
        
    }
}