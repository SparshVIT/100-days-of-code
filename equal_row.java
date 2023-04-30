class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<List<Integer>, Integer> h = new HashMap<>();
        for(int i=0;i<grid.length;i++){
            List<Integer> l = new ArrayList<>();
            for(int j=0;j<grid[i].length;j++){
                l.add(grid[i][j]);
            }
            if(h.containsKey(l)){
                h.put(l,h.get(l)+1);
            }
            else{
                h.put(l,1);
            }
        }
        int pairs = 0;
        for(int i=0;i<grid.length;i++){
            List<Integer> l = new ArrayList<>();
            for(int j=0;j<grid[i].length;j++){
                l.add(grid[j][i]);
            }
            if(h.containsKey(l)){
                pairs = pairs+h.get(l);
            }
        }
        return pairs;
    }
}
