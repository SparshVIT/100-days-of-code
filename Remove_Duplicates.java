class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int a = nums[i];
            if(h.containsKey(a)){
                h.put(a,h.get(a)+1);
                if(h.get(a)>2){
                    nums[i] = Integer.MAX_VALUE;
                    count++;
                }
            }
            else{
                h.put(a,1);
            }
        }
        Arrays.sort(nums);
        nums = Arrays.copyOf(nums,nums.length-count);
        return nums.length;
    }
}
public class Remove_Duplicates {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}