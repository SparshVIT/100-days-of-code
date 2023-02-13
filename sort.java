class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> a = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            a.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=a.remove();
        }
        return nums;
    }
}
