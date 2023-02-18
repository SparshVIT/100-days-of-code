class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer, List<List<Integer>>> h = new HashMap<>();
        SortedSet<Integer> a = new TreeSet<>();
        for(int i=0;i<groupSizes.length;i++){
            int e = groupSizes[i];
            if(h.containsKey(e)){
                int len = h.get(e).get(h.get(e).size()-1).size();
                if(len>=e){
                    List<Integer> l1 = new ArrayList<>();
                    l1.add(i);
                    h.get(e).add(l1);
                }
                else{
                    h.get(e).get(h.get(e).size()-1).add(i);
                }
            }
            else{
                List<List<Integer>> l = new ArrayList<>();
                List<Integer> l1 = new ArrayList<>();
                l1.add(i);
                l.add(l1);
                h.put(e,l);
                a.add(e);
            }
        }
        List<List<Integer>> l = new ArrayList<>();
        for(int i: a){
            l.addAll(h.get(i));
        }
        return l;
    }
}
