class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l.add(l1);
        int num = rowIndex+1;
        if(num>=2){
            List<Integer> l2 = new ArrayList<>();
            l2.add(1);
            l2.add(1);
            l.add(l2);
            while(l.size()!=num){
                List<Integer> l3 = l.get(l.size()-1);
                int cpt = 0;
                List<Integer> l4 = new ArrayList<>();
                l4.add(1);
                while(cpt<l3.size()-1){
                    int npt = cpt+1;
                    l4.add(l3.get(npt)+l3.get(cpt));
                    cpt++;
                }
                l4.add(1);
                l.add(l4);
            }
        }
        return l.get(rowIndex);
    }
}
