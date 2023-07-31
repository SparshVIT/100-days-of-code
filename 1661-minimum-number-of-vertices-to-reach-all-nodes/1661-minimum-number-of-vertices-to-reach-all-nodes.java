class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int ind[] = new int[n];
        for(int i=0;i<edges.size();i++){
            int d = edges.get(i).get(1);
            ind[d] = 1;
        }
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<ind.length;i++){
            if(ind[i]!=1){
                l.add(i);
            }
        }
        return l;
    }
}