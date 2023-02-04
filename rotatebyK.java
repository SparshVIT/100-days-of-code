class Solution {
    public void rotate(int[] nums, int k) {
       Deque<Integer> d = new LinkedList<>();
       for(int i = 0; i<nums.length;i++){
           d.add(nums[i]);
       }
       for(int i=0;i<k;i++){
           int a = d.pollLast();
           d.addFirst(a);
       }
       int j = 0;
       for(int i: d){
           nums[j] = i;
           j++;
       }

    }
}
