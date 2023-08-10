class Solution {
    public void dfs(List<List<Integer>> adj, List<Integer> l, int a, boolean visit[]){
        for(int v: adj.get(a)){
            if(visit[v]==false){
                visit[v] = true;
                l.add(v);
                dfs(adj,l,v,visit);
            }
        }
    }
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i=0;i<edges.length;i++){
            int d = edges[i][0];
            int  d1 = edges[i][1];
            adj.get(d1).add(d);
        }
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            boolean visit[] = new boolean[n];
            List<Integer> l1 = new ArrayList<>();
            dfs(adj,l1,i,visit);
            Collections.sort(l1);
            res.add(l1);
        }
        return res;
    }
}