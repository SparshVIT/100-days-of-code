class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();
        boolean contain = false;
        for(int i=0;i<nums.length;i++){
            int a = nums[i];
            if(h.containsKey(a)){
                int index = h.get(a);
                if(Math.abs(i-index)<=k){
                    contain = true;
                    break;
                }
                else{
                    h.put(a,i);
                }
            }
            else{
                h.put(a,i);
            }
        }
        return contain;
    }
}
public class Duplicates {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}