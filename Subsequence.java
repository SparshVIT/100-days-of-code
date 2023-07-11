class Solution {
    HashMap<List<Integer>,Integer> h = new HashMap<>();
    public boolean issorted(List<Integer> a){
        for(int i=1;i<a.size();i++){
            if(a.get(i)<a.get(i-1)){
                return false;
            }
        }
        return true;
    }
    public void fs(int[] nums, int d, List<Integer> a,List<List<Integer>> l){
        if(d>=nums.length){
            if(issorted(a) && a.size()>=2 && h.containsKey(a)==false ){
                h.put(a,1);
                l.add(a);
            }
            return;
        }
        a.add(nums[d]);
        fs(nums,d+1,new ArrayList<>(a),l);
        a.remove(a.size()-1);
        fs(nums,d+1,new ArrayList<>(a),l);
    }
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<Integer> a = new ArrayList<>();
        List<List<Integer>> l = new ArrayList<>();
        fs(nums,0,a,l);
        return l;
    }
}
