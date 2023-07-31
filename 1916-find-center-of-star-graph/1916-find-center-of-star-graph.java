class Solution {
    public int findCenter(int[][] edges) {
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<edges.length;i++){
            p.add(edges[i][0]);
            p.add(edges[i][1]);
        }
        int m = p.remove();
        List<List<Integer>> l = new ArrayList<>();
        for(int i=0;i<m;i++){
            List<Integer> l1 = new ArrayList<>();
            l.add(l1);
        }
        for(int i=0;i<edges.length;i++){
            int d = edges[i][0];
            int d1 = edges[i][1];
            l.get(d-1).add(d1-1);
            l.get(d1-1).add(d-1);
        }
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<l.size();i++){
            if(l.get(i).size()>max){
                count = i;
                max = l.get(i).size();
            }
        }
        return count+1;
    }
}