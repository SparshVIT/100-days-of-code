class Solution {
    public int findShortestCycle(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++)
        adj.add(new ArrayList<Integer>());
        
        for(int edge[]: edges){
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        int ans = Integer.MAX_VALUE;
 
        for (int i = 0; i < n; i++)
        {
            int[] dist = new int[n];
            Arrays.fill(dist, (int) 1e9);
 
            int[] par = new int[n];
            Arrays.fill(par, -1);
 
            dist[i] = 0;
            Queue<Integer> q = new LinkedList<>();
 
            q.add(i);
 
            while (!q.isEmpty())
            {
 
                // Take the first element
                int x = q.poll();
 
                // Traverse for all it's childs
                for (int child : adj.get(x))
                {
                    // If it is not visited yet
                    if (dist[child] == (int) (1e9))
                    {
 
                        // Increase distance by 1
                        dist[child] = 1 + dist[x];
 
                        // Change parent
                        par[child] = x;
 
                        // Push into the queue
                        q.add(child);
                    } else if (par[x] != child && par[child] != x)
                        ans = Math.min(ans, dist[x] + dist[child] + 1);
                }
            }
        }
 
        // If graph contains no cycle
        if (ans == Integer.MAX_VALUE)
            return -1;
 
        // If graph contains cycle
        else
            return ans;
    }
}