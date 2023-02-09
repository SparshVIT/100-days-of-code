class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Character> s1 = new Stack<>();
        Stack<Integer> n = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('){
                s1.push(c);
                n.push(i);
            }
            else if(c==')'){
                if(s1.size()==0){
                    s1.push(c);
                    n.push(i);
                }
                else if(s1.peek()=='('){
                    s1.pop();
                    n.pop();
                }
                else if(s1.peek()==')'){
                    s1.push(c);
                    n.push(i);
                }
            }
        }
        String result = "";
        for(int i=0;i<s.length();i++){
            if(n.indexOf(i)>-1){
                continue;
            }
            else{
                result = result+String.valueOf(s.charAt(i));
            }
        }
        return result;
    }
}
