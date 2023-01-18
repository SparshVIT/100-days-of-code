class Solution {
    public boolean isUgly(int n) {
        boolean isugly = true;
        if(n==1){
            return true;
        }
        if(n<=0){
            return false;
        }
        while(n>0){
            if(n%5 == 0){
                n = n/5;
            }
            else if(n%3==0){
                n = n/3;
            }
            else if(n%2==0){
                n = n/2;
            }
            else{
                isugly = false;
                break;
            }
            if(n==1){
                break;
            }
        }
        return isugly;
        
    }
}
public class MyClass {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}