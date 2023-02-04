class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> h = new HashMap<>();
        HashMap<Character, Integer> h1 = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(h.containsKey(c)){
                h.put(c,h.get(c)+1);
            }
            else{
                h.put(c,1);
            }
        }
        for(int i = 0;i<t.length();i++){
            char c = t.charAt(i);
            if(h1.containsKey(c)){
                h1.put(c,h1.get(c)+1);
            }
            else{
                h1.put(c,1);
            }
        }
        boolean isanagram = true;
        for(char i: h.keySet()){
            if(h1.containsKey(i)==false){
                isanagram = false;
                break;
            }
            else{
                int f1 = h.get(i);
                int f2 = h1.get(i);
                if(f1!=f2){
                    isanagram = false;
                    break;
                }
                
            }
        }
        return isanagram;
    }
}
