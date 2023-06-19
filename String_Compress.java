class Solution {
    public int compress(char[] chars) {
        Stack<Character> s = new Stack<>();
        String c = "";
        s.push(chars[0]);
        int count = 1;
        for(int i=1;i<chars.length;i++){
            if(s.peek()==chars[i]){
                count++;
                s.push(chars[i]);
            }
            else{
                String d = String.valueOf(s.peek());
                String v = String.valueOf(count);
                count = 1;
                s.clear();
                s.push(chars[i]);
                if(v.equals("1")==false){
                    c = c+d+v;
                }
                else{
                    c = c+d;
                }
                

            }
        }
       if(count!=1){
            c = c+String.valueOf(s.peek())+String.valueOf(count);
       }
       else{
           c = c+String.valueOf(s.peek());
       }
        if(chars.length!=1){
            for(int i=0;i<c.length();i++){
                chars[i] = c.charAt(i);
            }
            return c.length();
        }
        return 1;
        
    }
}
