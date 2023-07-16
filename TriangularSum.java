class Solution {
    int n[] = new int[1];
    public void sumt(int[] nums){
        if(nums.length==1){
            n = nums;
            return;
        }
        int nums2[] = new int[nums.length-1];
        for(int i=0;i<nums.length-1;i++){
            int sum = nums[i]+nums[i+1];
            nums2[i] = sum%10;
        }
        nums = nums2;
        sumt(nums2);
    }
    public int triangularSum(int[] nums) {
        sumt(nums);
        return n[0];
    }
}
