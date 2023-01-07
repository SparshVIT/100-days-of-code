class Solution {
    public void sortColors(int[] nums) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            p.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = p.remove();
        }
    }
}
public class Sortwithoursort {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}