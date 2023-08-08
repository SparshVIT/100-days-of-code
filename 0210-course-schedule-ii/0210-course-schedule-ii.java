class Solution {
    List<Integer> l1 = new ArrayList<>();
    public boolean cy(List<List<Integer>> l, int d, boolean visit[], boolean rect[]){
        visit[d] = true;
        rect[d] = true;
        for(int v: l.get(d)){
            if(visit[v]==false && cy(l,v,visit,rect)){
                return true;
            }
            else if(rect[v]==true){
                return true;
            }
        }
        rect[d] = false;
        l1.add(d);
        return false;
    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        boolean visit[] = new boolean[numCourses];
        boolean rect[] = new boolean[numCourses];
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            int d = prerequisites[i][0];
            int d1 = prerequisites[i][1];
            adj.get(d).add(d1);
        }
        for(int i=0;i<numCourses;i++){
            if(visit[i]==false){
                if(cy(adj,i,visit,rect)==true){
                    return new int[0];
                }
            }
        }
        int arr[] = new int[l1.size()];
        for(int i=0;i<l1.size();i++){
            arr[i] = l1.get(i);
        }
        return arr;
    }
}