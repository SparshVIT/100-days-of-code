class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int pos = 0;
        int starting = pos;
        int max_len = 0;
        
        while(pos<s.length()){
            boolean check = set.add(s.charAt(pos));
            if(check==false){
                max_len = Math.max(max_len, set.size());
                set.clear();
                starting++;
                pos = starting;
            }
            else{
                pos++;
                max_len = Math.max(max_len, set.size());
            }
        }
        return max_len;

    }
}
public class Substring {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}