class Solution {
    public boolean hasAlternatingBits(int n) {
        String s = Integer.toBinaryString(n);
        boolean check = true;
        for(int i=0;i<s.length()-1;i++){
            char p= s.charAt(i);
            char nt = s.charAt(i+1);
            if(p==nt){
                check = false;
            }
        }
        return check;
    }
}
public class MyClass {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}