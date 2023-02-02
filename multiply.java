class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pr[] = new int[nums.length];
        int sr[] = new int[nums.length];
        pr[0] = 1;
        sr[nums.length-1] = 1;
        for(int i=1;i<nums.length;i++){
            pr[i] = pr[i-1]*nums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            sr[i] = sr[i+1]*nums[i+1];
        }
        for(int i=0;i<nums.length;i++){
            pr[i] = pr[i]*sr[i];
        }
        return pr;
    }
}
