//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int V = Integer.parseInt(read.readLine());
            
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            
            for(int i=0; i<V; i++)
            {
                String S[] = read.readLine().split(" ");
                ArrayList<Integer> temp = new ArrayList<>();
                for(int j=0; j<V; j++)
                    temp.add(Integer.parseInt(S[j]));
                adj.add(temp);
            }

            Solution ob = new Solution();
            System.out.println(ob.numProvinces(adj,V));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    void vis(ArrayList<ArrayList<Integer>> adj, int V, int s, boolean visit[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        visit[s] = true;
        while(q.isEmpty()!=true){
            int d = q.poll();
            for(int i=0;i<adj.get(d).size();i++){
                if(adj.get(d).get(i)==0){
                    continue;
                }
                if(visit[i]==false){
                    q.add(i);
                    visit[i] = true;
                }
            }
        }
    }
    int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        boolean visit[] = new boolean[V+1];
        int count = 0;
        for(int i=0;i<V;i++){
            if(visit[i]==false){
                count++;
                vis(adj,V,i,visit);
            }
        }
        return count;
    }
};