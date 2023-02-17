class Solution {
    public boolean isPowerOfFour(int n) {
        boolean check = true;
        if(n<=0){
            return false;
        }
        while(n>1){
            if(n%4==0){
                n = n/4;
                
            }
            else{
                check = false;
                break;
            }
        }
        return check;
    }
}
