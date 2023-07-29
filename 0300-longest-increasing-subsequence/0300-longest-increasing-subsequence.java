class Solution {
    public int lis(int[] nums){
        int ls[] = new int[nums.length];
        ls[0] = 1;
        for(int i=1;i<ls.length;i++){
            ls[i] = 1;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    ls[i] = Math.max(ls[i],ls[j]+1);
                }
            }
        }
        int res = ls[0];
        for(int i=1;i<ls.length;i++){
            res = Math.max(res,ls[i]);
        }
        return res;
    }
    public int lengthOfLIS(int[] nums) {
        return lis(nums);
    }
}