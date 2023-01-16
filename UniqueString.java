class Solution {
    public String findDifferentBinaryString(String[] nums) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int a = Integer.parseInt(nums[i],2);
            h.put(a,1);
        }
        int b = (int)(Math.pow(2,nums.length));
        int num = 0;
        for(int i=0;i<b;i++){
            if(h.containsKey(i)==false){
                num = i;
                break;
            }
        }
        String s = Integer.toBinaryString(num);
        int l = s.length();
        for(int i=0;i<nums.length-l;i++){
            s = "0"+s;
        }
        return s;
    }
}
public class UniqueString {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}