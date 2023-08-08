class Solution {
    //HashSet<Integer> h = new HashSet<>();
    List<Integer> h = new ArrayList<>();
    public boolean traverse(List<List<Integer>> l, int s, boolean visit[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        visit[s] = true;
        h.add(s);
        while(q.isEmpty()!=true){
            int d = q.poll();
            for(int v: l.get(d)){
                if(visit[v]==false){
                    visit[v] = true;
                    q.add(v);
                    h.add(v);
                }
            }
        }
        boolean t = true;
        for(int i=0;i<h.size();i++){
            int d = h.get(i);
            if(l.get(d).size() != h.size()-1){
                t = false;
                break;
            }
        }
        return t;
    }
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> l =  new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int d = edges[i][0];
            int d1 = edges[i][1];
            l.get(d).add(d1);
            l.get(d1).add(d);
        }
        boolean visit[] = new boolean[n];
        int res = 0;
        for(int i=0;i<n;i++){
            h = new ArrayList<>();
            if(visit[i]==false){
                if(traverse(l,i,visit)){
                    res++;
                }
            }
        }
        return res;
    }
}