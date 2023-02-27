class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character, Integer>,ArrayList<String>> h = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s = strs[i];
            HashMap<Character,Integer> h1 = new HashMap<>();
            for(int j=0;j<s.length();j++){
                char c = s.charAt(j);
                if(h1.containsKey(c)){
                    h1.put(c,h1.get(c)+1);
                }
                else{
                    h1.put(c,1);
                }
            }
            if(h.containsKey(h1)){
                h.get(h1).add(s);
            }
            else{
                ArrayList<String> a = new ArrayList<>();
                a.add(s);
                h.put(h1,a);
            }
        }
        List<List<String>> l = new ArrayList<>();
        for(HashMap<Character,Integer> h2: h.keySet()){
            l.add(h.get(h2));
        }
        return l;
    }
}
