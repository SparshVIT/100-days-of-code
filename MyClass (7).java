class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        PriorityQueue<Integer> a = new PriorityQueue<>();
        if(nums1.length!=0 && nums2.length!=0){
            for(int i=0;i<m;i++){
                a.add(nums1[i]);
            }
            for(int i=0;i<n;i++){
                a.add(nums2[i]);
            }
            for(int i=0;i<nums1.length;i++){
                nums1[i] = a.remove();
            }
        }
    }
}
public class MyClass {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}