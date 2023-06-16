class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String s1 = tokens[i];
            try{
                int a = Integer.parseInt(tokens[i]);
                s.push(a);
            }catch(Exception e){
                if(s.size()<=1){
                    return s.peek();
                }
                else{
                    int a = s.pop();
                    int b = s.pop();
                    if(s1.equals("+")){
                        int c = a+b;
                        s.push(c);
                    }
                    else if(s1.equals("-")){
                        int c = b-a;
                        s.push(c);
                    }
                    else if(s1.equals("*")){
                        int c = b*a;
                        s.push(c);
                    }
                    else if(s1.equals("/")){
                        int c = b/a;
                        s.push(c);
                    }
                }
            }
        }
        return s.peek();
    }
}
