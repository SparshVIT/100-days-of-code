class Solution {
    public boolean isSubsequence(String s, String t) {
        HashMap<Character,Integer> h = new HashMap<>();
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            if(h.containsKey(c)){
                h.put(c,h.get(c)+1);
            }
            else{
                h.put(c,1);
            }
        }
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(h.containsKey(c)){
                if(h.get(c)>0){
                    h.put(c,h.get(c)-1);
                }
                if(h.get(c)==0){
                    h.remove(c);
                }
            }
            else{
                return false;
            }
        }
        ArrayList<Integer> a = new ArrayList<>();
        int index = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int ind = t.indexOf(c,index);
            a.add(ind);
            index = ind;

        }
        for(int i=0;i<a.size()-1;i++){
            int c = a.get(i);
            int d = a.get(i+1);
            if(c>d){
                return false;
            }
        }
        return true;
    }
}
