import java.util.* ;
import java.io.*; 
public class Solution{
     public static boolean bfs(ArrayList<ArrayList<Integer>>adj, int s, boolean visit[], int A){
        Queue<Integer> q = new LinkedList<>();
        visit[s] = true;
        int tc = 1;
        q.addAll(adj.get(s));
        while(q.isEmpty()!=true){
            int d = q.poll();
            if(visit[d]){
                continue;
            }
            q.addAll(adj.get(d));
            visit[d] = true;
            tc++;
        }
        if(tc==A){
            return true;
        }
        return false;
        
    }
    public static int findHouse(int[][] paths, int n, int m){
        // Write your code here.
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(new ArrayList<>());
        }
        for(int i=0;i<paths.length;i++){
            int d = paths[i][0];
            int d1 = paths[i][1];
            a.get(d).add(d1);
        }
        for(int i=0;i<n;i++){
            boolean visit[] = new boolean[n];
            if(bfs(a,i,visit, n)){
                return i;
            }
        }
        return -1;
    }
}
