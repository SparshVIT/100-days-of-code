class Solution {
    public int getLucky(String s, int k) {
        HashMap<Character, Integer> h = new HashMap<>();
        int j = 1;
        for(char c = 'a'; c<='z';c++){
            h.put(c,j);
            j++;
        }
        String s1 = "";
        for(int i = 0; i<s.length();i++){
            char c  = s.charAt(i);
            int x = h.get(c);
            s1 += String.valueOf(x);
        }
        for(int i=0;i<k;i++){
            int value = 0;
            for(int y=0;y<s1.length();y++){
                value += Integer.parseInt(String.valueOf(s1.charAt(y)));
            }
            s1 = String.valueOf(value);
        }
        return Integer.parseInt(s1);
    }
}
public class MyClass {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}