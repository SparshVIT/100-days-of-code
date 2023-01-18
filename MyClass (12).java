class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            p.add(nums[i]);
        }
        int ele = 0;
        for(int i=0;i<k;i++){
            ele = p.remove();
        }
        return ele;
    }
}
public class MyClass {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}