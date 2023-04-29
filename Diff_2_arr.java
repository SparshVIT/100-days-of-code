class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> h1 = new HashMap<>();
        HashMap<Integer,Integer> h2 = new HashMap<>();
        for(int i = 0;i<nums1.length;i++){
            h1.put(nums1[i],1);
        }
        for(int i = 0;i<nums2.length;i++){
            h2.put(nums2[i],1);
        }
        List<Integer> l1 = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            if(h2.containsKey(nums1[i])==false){
                if(l1.contains(nums1[i])==false){
                    l1.add(nums1[i]);
                }
            }
        }
        List<Integer> l2 = new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(h1.containsKey(nums2[i])==false){
                if(l2.contains(nums2[i])==false){
                    l2.add(nums2[i]);
                }
            }
        }
        List<List<Integer>> l = new ArrayList<>();
        l.add(l1);
        l.add(l2);
        return l;
    }
}
