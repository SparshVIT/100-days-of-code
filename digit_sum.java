class Solution {
    public int differenceOfSum(int[] nums) {
        int sum  = 0;
        String s = "";
        for(int i=0;i<nums.length;i++){
            sum = sum+nums[i];
            s += String.valueOf(nums[i]);
        }
        int ds = 0;
        for(int i=0;i<s.length();i++){
            ds+=Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        int sub = Math.abs(sum-ds);
        return sub;
    }
}
