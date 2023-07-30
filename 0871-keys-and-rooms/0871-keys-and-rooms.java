class Solution {
    public void fin(List<List<Integer>> rooms, int s, boolean visit[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        visit[s] = true;
        while(q.isEmpty()!=true){
            int d = q.poll();
            for(int v: rooms.get(d)){
                if(visit[v]==false){
                    q.add(v);
                    visit[v] = true;
                }
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean visit[] = new boolean[rooms.size()];
        fin(rooms,0,visit);
        for(int i=1;i<rooms.size();i++){
            if(visit[i]==false){
                return false;
            }
            else{
                fin(rooms,i,visit);
            }
        }
        return true;
    }
}