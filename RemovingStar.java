class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c  = s.charAt(i);
            if('a'<=c && c<='z'){
                st.push(c);
            }
            else if(c=='*'){
                st.pop();
            }
        }
        String result = "";
        for(int i=0;i<st.size();i++){
            result += String.valueOf(st.get(i));
        }
        return result;
    }
}
