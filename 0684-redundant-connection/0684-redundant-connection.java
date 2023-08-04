class Solution {
    ArrayList<ArrayList<Integer>>a = new ArrayList<>();
    public boolean dfs(List<List<Integer>> adj, int s, boolean visit[], int p){
        visit[s] = true;
        for(int v: adj.get(s)){
            if(visit[v]==false){
                if(dfs(adj,v,visit,s)==true){
                    return true;
                }
            }
            else if(v!=p){
                System.out.println(s+" "+v);
                ArrayList<Integer> a1 = new ArrayList<>();
                a1.add(s);
                a1.add(v);
                a.add(a1);
                return true;
            }
        }
        return false;
    }
    public int[] findRedundantConnection(int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<=edges.length;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int d = edges[i][0];
            int d1 = edges[i][1];
            adj.get(d).add(d1);
            adj.get(d1).add(d);
        }
        //System.out.println(adj);
        int arr[] = new int[2];
        arr[0] = -1;
        arr[1] = -1;
        for(int i=1;i<=edges.length;i++){
            boolean visit[] = new boolean[edges.length+1];
            if(visit[i]==false){
                dfs(adj,i,visit,-1);
            }
            //System.out.println(arr[0]+" "+arr[1]);
        }
        for(int i=0;i<edges.length;i++){
            ArrayList<Integer> a1 = new ArrayList<>();
            a1.add(edges[i][0]);
            a1.add(edges[i][1]);
            if(a.contains(a1)){
                arr[0] = a1.get(0);
                arr[1] = a1.get(1);
            }
        }
        
        return arr;
        
    }
}