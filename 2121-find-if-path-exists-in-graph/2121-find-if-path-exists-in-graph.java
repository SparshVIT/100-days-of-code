class Solution {
    public void valid(List<List<Integer>> l, int s, boolean visit[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        visit[s] = true;
        while(q.isEmpty()!=true){
            int d = q.poll();
            for(int v: l.get(d)){
                if(visit[v]==false){
                    visit[v] = true;
                    q.add(v);
                }
            }
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> l = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> l1 = new ArrayList<>();
            l.add(l1);
        }
        for(int i=0;i<edges.length;i++){
            int d = edges[i][0];
            int d1 = edges[i][1];
            l.get(d).add(d1);
            l.get(d1).add(d);
        }
        boolean visit[] = new boolean[n];
        valid(l,source,visit);
        if(visit[destination]==true){
            return true;
        }
        return false;
    }
}