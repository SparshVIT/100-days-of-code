class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            h.put(nums1[i],1);
        }
        Set<Integer> s = new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            if(h.containsKey(nums2[i])){
                s.add(nums2[i]);
            }
        }
        int arr[] = new int[s.size()];
        int j = 0;
        for(int i: s){
            arr[j] = i;
            j++;
        }
        return arr;
    }
}
public class arr {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}