class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(h.containsKey(nums[i])){
                h.put(nums[i],h.get(nums[i])+1);
            }
            else{
                h.put(nums[i],1);
            }
        }
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int a = nums[i];
            if(h.get(a)==1 && (h.containsKey(a-1)==false) && (h.containsKey(a+1)==false)){
                l.add(a);
            }
        }
        return l;
    }
}