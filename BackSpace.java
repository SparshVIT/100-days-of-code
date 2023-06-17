class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2  = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if('a'<=c && c<='z'){
                st1.push(c);
            }
            else if(c=='#'){
                if(st1.size()>0){
                    st1.pop();
                }
            }
        }
        for(int i=0;i<t.length();i++){
            char c= t.charAt(i);
            if('a'<=c && c<='z'){
                st2.push(c);
            }
            else if(c=='#'){
                if(st2.size()>0){
                    st2.pop();
                }
            }
        }
        String s1 = "";
        String s2 = "";
        for(int i=0;i<st1.size();i++){
            s1 = s1+String.valueOf(st1.get(i));
        }
        for(int i=0;i<st2.size();i++){
            s2 = s2+String.valueOf(st2.get(i));
        }
        if(s1.equals(s2)){
            return true;
        }
        return false;
    }
}
