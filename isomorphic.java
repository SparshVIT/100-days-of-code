class Solution {
    public boolean isIsomorphic(String s, String t) {
        Set<Character> s1 = new HashSet<>();
        Set<Character> s2 = new HashSet<>();
        for(int i = 0;i<s.length();i++){
            s1.add(s.charAt(i));
        }
        for(int i = 0;i<t.length();i++){
            s2.add(t.charAt(i));
        }
        if(s1.size()!=s2.size()){
            return false;
        }
        HashMap<Character,Character> h = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            char d = t.charAt(i);
            if(h.containsKey(c)){
                if(h.get(c)!=d){
                    return false;
                }
            }
            else{
                h.put(c,d);
            }
        }
        return true;
    }
}
