public class MyClass {
    public static void main(String args[]) {
      Solution sol = new Solution();
      Scanner s = new Scanner();
      String s1 = s.next();
      String s2 = s.next();
      int a = sol.minRepeats(s1,s2)l
      System.out.println(a);
    }
}
class Solution {
    static int minRepeats(String A, String B) {
        // code here
        boolean istrue = false;
        int attempt = 1;
        StringBuilder str = new StringBuilder();
        str.append(A);
        int count = B.length()/A.length()+1;
        int a = 0;
        while(a<count){
            if(str.indexOf(B)>=0){
                istrue = true;
                break;
            }
            else{
                str.append(A);
                attempt++;
            }
            a++;
        }
        if(istrue){
            return attempt;
        }
        return -1;
    }
};