class Solution {
    public List<Integer> intersection(int[][] nums) {
        SortedSet<Integer> s = new TreeSet<>();
        for(int i=0;i<nums[0].length;i++){
            s.add(nums[0][i]);
        }
        for(int i=1;i<nums.length;i++){
            SortedSet<Integer> s1 = new TreeSet<>();
            for(int j =0;j<nums[i].length;j++){
                s1.add(nums[i][j]);
            }
            s.retainAll(s1);
        }
        List<Integer> l = new ArrayList<>();
        for(int i: s){
            l.add(i);
        }
        return l;
    }
}
