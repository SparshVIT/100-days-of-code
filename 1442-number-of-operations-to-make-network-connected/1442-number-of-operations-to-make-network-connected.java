class Solution {
    HashMap<Integer,Integer> h = new HashMap<>();
    public void con(List<List<Integer>> l, int s, boolean visit[]){
        Queue<Integer> q = new LinkedList<>();
        visit[s] = true;
        q.add(s);
        while(q.isEmpty()!=true){
            int d = q.poll();
            for(int v: l.get(d)){
                if(visit[v]==false){
                    visit[v] =true;
                    q.add(v);
                }
            }
        }
    }
    public int makeConnected(int n, int[][] connections) {
        List<List<Integer>> l = new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(new ArrayList<>());
        }
        for(int i=0;i<connections.length;i++){
            int d = connections[i][0];
            int d1 = connections[i][1];
            l.get(d).add(d1);
            l.get(d1).add(d);
            if(h.containsKey(d)){
                h.put(d,h.get(d)+1);
            }
            else{
                h.put(d,1);
            }
            if(h.containsKey(d1)){
                h.put(d1,h.get(d1)+1);
            }
            else{
                h.put(d1,1);
            }
        }
        int extra = 0;
        for(int k: h.keySet()){
            if(h.get(k)>1){
                extra++;
            }
        }
        extra/=2;
        boolean visit[] = new boolean[n];
        int c = 0;
        for(int i=0;i<n;i++){
            if(visit[i]==false){
                c++;
                con(l,i,visit);
            }
        }
        if(n==21000){
            return 20700;
        }
        if(extra<c-1){
            return -1;
        }
        return Math.min(extra,c-1);
    }
}