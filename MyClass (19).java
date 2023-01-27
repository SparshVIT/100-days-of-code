class Solution {
    HashMap<Integer, ArrayList<Integer>> h = new HashMap<>();
    public Solution(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(h.containsKey(nums[i])){
                h.get(nums[i]).add(i);
            }
            else{
                ArrayList<Integer> a = new ArrayList<>();
                a.add(i);
                h.put(nums[i],a);
            }
        }
    }
    
    public int pick(int target) {
        int index = (int)(Math.random() * h.get(target).size());
        return h.get(target).get(index);
    }
}

public class MyClass {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}