class KthLargest {
    ArrayList<Integer> a = new  ArrayList<>();
    int v = 0;
    public KthLargest(int k, int[] nums) {
        for(int i=0;i<nums.length;i++){
            a.add(nums[i]);
        }
        v = k;
    }
    
    public int add(int val) {
        a.add(val);
        Collections.sort(a);
        return a.get(a.size()-v);
    }
}
