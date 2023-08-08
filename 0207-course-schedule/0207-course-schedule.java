class Solution {
    public boolean course(List<List<Integer>> l, int d, boolean visit[], boolean rect[]){
        visit[d] = true;
        rect[d] = true;
        for(int v: l.get(d)){
            if(visit[v]==false && course(l,v,visit,rect)){
                return true;
            }
            else if(rect[v]==true){
                return true;
            }
        }
        rect[d] = false;
        return false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean visit[] = new boolean[numCourses];
        boolean rect[] = new boolean[numCourses];
        List<List<Integer>> l = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            l.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            int d = prerequisites[i][0];
            int d1 = prerequisites[i][1];
            l.get(d).add(d1);
        }
        for(int i=0;i<numCourses;i++){
            if(visit[i]==false){
                if(course(l,i,visit,rect)==true){
                    return false;
                }
            }
        }
        return true;
    }
}