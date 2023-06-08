class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l.add(l1);
        if(numRows>=2){
            List<Integer>l2 = new ArrayList<>();
            l2.add(1);
            l2.add(1);
            l.add(l2);
            int level = numRows - 2;
            for(int i=0;i<level;i++){
                int cl = l.size()-1;
                List<Integer> l3 = l.get(cl);
                int currpt = 0;
                List<Integer> l4 = new ArrayList<>();
                l4.add(1);
                while(currpt!=l3.size()-1){
                    int nextpt = currpt+1;
                    int sum = l3.get(currpt)+l3.get(nextpt);
                    l4.add(sum);
                    currpt++;
                }
                l4.add(1);
                l.add(l4);
            }
        }
        return l;
    }
}
