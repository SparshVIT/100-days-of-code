class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> h = new HashMap<>();
        HashSet<Integer> h1 = new HashSet<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(h.containsKey(c)){
                h.put(c,h.get(c)+1);
            }
            else{
                h.put(c,1);
            }
        }
        for(char c: h.keySet()){
            h1.add(h.get(c));
        }
        if(h1.size()==1){
            return true;
        }
        return false;
    }
}
