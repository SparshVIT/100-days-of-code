class Solution {
    int ct = 0;
    public boolean isValid(int s, List<List<Integer>> l, boolean visit[]){
        visit[s] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        ct++;
        while(q.isEmpty()==false){
            int d = q.poll();
            //List<Integer> l1 = new ArrayList<>();
            for(int v: l.get(d)){
                if( v!=-1 && visit[v]==true){
                    return false;
                }
                if(v!=-1){
                    visit[v] = true;
                    q.add(v);
                    ct++;
                }
            }
            
        }
        return true;
    }
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        List<List<Integer>> l = new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            l.get(i).add(leftChild[i]);
            l.get(i).add(rightChild[i]);
        }
        boolean visit[] = new boolean[n];
        int c = 0;
        boolean t = true;
        boolean got = false;
        for(int i=0;i<n;i++){
            if(visit[i]==false){
                t &= isValid(i,l, visit);
                if(ct==n){
                    got = true;
                }
                Arrays.fill(visit,false);
                ct = 0;
            }
        }
        if(c>1){
            return false;
        }
        return t & got;
    }
}