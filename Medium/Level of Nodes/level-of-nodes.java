//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for(int i = 0; i < V+1; i++)
                list.add(i, new ArrayList<Integer>());
            for(int i = 0; i < E; i++)
            {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
                list.get(v).add(u);
            }
            int X = sc.nextInt();
            
            Solution ob = new Solution();
            
            System.out.println(ob.nodeLevel(V,list,X));
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/

class Solution
{
    //Function to find the level of node X.
    public int level(ArrayList<ArrayList<Integer>> l, int s, int X, boolean visit[]){
        if(X==s){
            return 0;
        }
        Queue<Integer> q = new LinkedList<>();
        visit[s] = true;
        List<Integer> l1 = new ArrayList<>();
        l1.addAll(l.get(s));
        q.addAll(l1);
        boolean found = false;
        int level = 1;
        while(q.isEmpty()!=true){
            l1 = new ArrayList<>();
            for(int i: q){
                if(visit[i]==true){
                    continue;
                }
                if(i==X){
                    return level;
                }
                l1.addAll(l.get(i));
                visit[i] = true;
            }
            q = new LinkedList<>();
            level++;
            q.addAll(l1);
        }
        return -1;
    }
    int nodeLevel(int V, ArrayList<ArrayList<Integer>> adj, int X)
    {
        // code here
        boolean visit[] = new boolean[V];
        return level(adj,0,X,visit);
        
    }
}