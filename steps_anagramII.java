class Solution {
    public int minSteps(String s, String t) {
        int append = 0;
        HashMap<Character, Integer> h = new HashMap<>();
        HashMap<Character, Integer> h1 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(h.containsKey(c)){
                h.put(c,h.get(c)+1);
            }
            else{
                h.put(c,1);
            }
        }
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            if(h1.containsKey(c)){
                h1.put(c,h1.get(c)+1);
            }
            else{
                h1.put(c,1);
            }
        }
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            if(h.containsKey(c)&& h.get(c)>0){
                h.put(c,h.get(c)-1);
            }
            else{
                append++;
            }
        }
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(h1.containsKey(c)&& h1.get(c)>0){
                h1.put(c,h1.get(c)-1);
            }
            else{
                append++;
            }
        }
        return append;
    }
}
