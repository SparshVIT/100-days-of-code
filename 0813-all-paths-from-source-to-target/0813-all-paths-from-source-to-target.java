class Solution {
    List<List<Integer>> l = new ArrayList<>();
    public void find(int[][] g, int d, List<Integer> l1){
        if(d>=g.length){
            return;
        }
        if(d==g.length-1){
            l.add(l1);
            return;
        }
        for(int i=0;i<g[d].length;i++){
            l1.add(g[d][i]);
            find(g,g[d][i],new ArrayList<>(l1));
            l1.remove(l1.size()-1);
        }
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int d = 0;
        List<Integer> l1 = new ArrayList<>();
        l1.add(0);
        find(graph,d,l1);
        return l;
    }
}