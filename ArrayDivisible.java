class Solution {
    public int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
    public int minOperations(int[] nums, int[] numsDivide) {
        Arrays.sort(nums);
        Arrays.sort(numsDivide);
        int r = 0;
        if(numsDivide.length==1){
            r = numsDivide[0];
        }
        else{
            r = gcd(numsDivide[0],numsDivide[1]);
        }
        for(int i=2;i<numsDivide.length;i++){
            r = gcd(r,numsDivide[i]);
        }
        int d = -1;
        for(int i=0;i<nums.length;i++){
            if(r%nums[i]==0){
                d = i;
                break;
            }
        }
        return d;
    }
}
