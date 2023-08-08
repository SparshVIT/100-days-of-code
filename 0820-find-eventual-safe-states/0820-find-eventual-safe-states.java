class Solution {
    List<Integer> l = new ArrayList<>();
    public void topo(List<List<Integer>> adj, int indegree[]){
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        while(q.isEmpty()!=true){
            int d = q.poll();
            l.add(d);
            for(int v: adj.get(d)){
                indegree[v]--;
                if(indegree[v]==0){
                    q.add(v);
                }
            }
        }
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<List<Integer>> adj = new ArrayList<>();
        int indegree[] = new int[graph.length];
        for(int i=0;i<graph.length;i++){
            indegree[i] = 0;
        }
        for(int i=0;i<graph.length;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].length;j++){
                adj.get(graph[i][j]).add(i);
                indegree[i]++;
            }
        }
        //System.out.println(adj);
        topo(adj,indegree);
        Collections.sort(l);
        return l;

    }
}