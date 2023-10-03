class Solution {
    List<List<Integer>> l = new ArrayList<>();
    public void dfs(int[][] g, int s, List<Integer> l1, boolean visit[]){
        visit[s] = true;
        l1.add(s);
        for(int v: g[s]){
            dfs(g,v,new ArrayList<>(l1),visit);
        }
        if(l1.get(l1.size()-1)==g.length-1){
            l.add(l1);
        }
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int d = 0;
        List<Integer> l1 = new ArrayList<>();
        boolean visit[] = new boolean[graph.length];
        dfs(graph,0,l1,visit);
        return l;
    }
}