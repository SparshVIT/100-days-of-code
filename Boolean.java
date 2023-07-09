class Solution {
    public boolean not(char c){
        if(c=='t'){
            return false;
        }
        return true;
    }
    public char and(char c1, char c2){
        if(c1=='t' && c2=='t'){
            return 't';
        }
        return 'f';
    }
    public char or(char c1, char c2){
        if(c1=='f' && c2=='f'){
            return 'f';
        }
        return 't';
    }
    public boolean parseBoolExpr(String expression) {
        if(expression.equals("t")){
            return true;
        }
        else if(expression.equals("f")){
            return false;
        }
        Stack<Character> st = new Stack<>();
        for(int i=0;i<expression.length();i++){
            char c = expression.charAt(i);
            if(c!=')' && c!=','){
                st.push(c);
            }
            else if(c==')'){
                int j = st.size()-1;
                while(j>=0 && st.get(j)!='('){
                    j--;
                }
                int index = j;
                char sign = st.get(index-1);
                st.remove(index-1);
                if((st.size()-1)-(index-1)<=1){
                    if(sign=='!'){
                        if(st.peek()=='f'){
                            st.pop();
                            st.push('t');
                        }
                        else if(st.peek()=='t'){
                            st.pop();
                            st.push('f');
                        }
                    }
                }
                while((st.size()-1)-(index-1)>1){
                    char c1 = st.pop();
                    char c2 = st.pop();
                    if(sign=='&'){
                        char c3 = and(c1,c2);
                        st.push(c3);
                    }
                    else if(sign=='|'){
                        char c3 = or(c1,c2);
                        st.push(c3);
                    }
                }
                st.remove(st.size()-2);
            }
        }
        if(st.peek()=='t'){
            return true;
        }
        return false;
        
    }
}
