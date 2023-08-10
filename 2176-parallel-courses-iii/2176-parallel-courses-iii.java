class Solution {
    int res = 0;
    int r[] = new int[0];
    public void t(List<List<Integer>> l, int indegree[], int[] time){
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0){
                q.add(i);
                r[i-1] = time[i-1];
            }
        }
        //System.out.println(max);
        while(q.isEmpty()!=true){
            int d = q.poll();
            for(int v: l.get(d)){
                r[v-1] = Math.max(r[v-1],r[d-1]+time[v-1]);
                indegree[v]--;
                if(indegree[v]==0){
                    q.add(v);
                }
            }
            
        }
    }
    public int minimumTime(int n, int[][] relations, int[] time) {
        List<List<Integer>> l = new ArrayList<>();
        r = new int[n];
        for(int i=0;i<=n;i++){
            l.add(new ArrayList<>());
        }
        int indegree[] = new int[n+1];
        for(int i=0;i<=n;i++){
            if(i==0){
                indegree[0] = -1;
            }
            else{
                indegree[i] = 0;
            }
        }
        for(int i=0;i<relations.length;i++){
            int d = relations[i][0];
            int d1 = relations[i][1];
            indegree[d1]++;
            l.get(d).add(d1);
        }
        t(l,indegree,time);
        int res = 0;
        for(int v: r){
            res = Math.max(res,v);
        }
        return res;
    }
}