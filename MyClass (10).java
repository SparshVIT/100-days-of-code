class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        if(s.charAt(0)==')'||s.charAt(0)=='}'||s.charAt(0)==']'){
            return false;
        }
        else{
            st.push(s.charAt(0));
        }
        for(int i=1;i<s.length();i++){
            char a = s.charAt(i);
            if(st.size()==0){
                st.push(a);
            }
            else{
                if(st.peek()=='('){
                    if(a==')'){
                        st.pop();
                    }
                    else if(a=='}'){
                        return false;
                    }
                    else if(a==']'){
                        return false;
                    }
                    else{
                        st.push(a);
                    }
                }
                else if(st.peek()=='{'){
                    if(a==')'){
                        return false;
                    }
                    else if(a=='}'){
                        st.pop();
                    }
                    else if(a==']'){
                        return false;
                    }
                    else{
                        st.push(a);
                    }
                }
                else if(st.peek()=='['){
                    if(a==')'){
                        return false;
                    }
                    else if(a=='}'){
                        return false;
                    }
                    else if(a==']'){
                        st.pop();
                    }
                    else{
                        st.push(a);
                    }
                }
                else{
                    st.push(a);
                }
            }
        }
        boolean isit = false;
        if(st.size()==0){
            isit = true;
        }
        return isit;
    }
}
public class MyClass {
    public static void main(String args[]) {
     Solution s = new Solution();
    }
}