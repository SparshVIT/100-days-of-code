class Solution {
    public boolean isPowerOfTwo(int n) {
        int res = 0;
        while(n>0){
            n = n&(n-1);
            res+=1;
        }
        if(res==1){
            return true;
        }
        return false;
        
    }
}