class Solution {
    public double pow(double x, int n){
        if(n==0){
            return 1;
        }
        return x*(pow(x,n-1));

    }
    public double myPow(double x, int n) {
        String  s = String.valueOf(n);
        if(s.length()>=9){
            if(n<0){
                if(x==1 || x==-1){
                    return (double)(1);
                }
                else{
                    return (double)(0);
                }
            }
            else{
                n = n/Integer.MAX_VALUE;
            }
        }
        boolean is_negative = false;
        if(n<0){
            n = -1*n;
            is_negative = true;
        }
        double a = pow(x,n);
        if(is_negative){
            a = 1/a;
        }
        return a;

    }
}
public class power {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}