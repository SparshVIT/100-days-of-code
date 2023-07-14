class Solution {
    HashMap<String,Integer> h = new HashMap<>();
    public void subsequence(String tiles, int d, StringBuilder s){
        if(d==tiles.length()){
            if(s.length()!=0){
                String a = s.toString();
                perm(a,0,new HashMap<Integer,Integer>(),new StringBuilder());
            }
            return;
        }
        s.append(String.valueOf(tiles.charAt(d)));
        subsequence(tiles,d+1,new StringBuilder(s));
        s.deleteCharAt(s.length()-1);
        subsequence(tiles,d+1,new StringBuilder(s));
    }
    public void perm(String tiles, int d,HashMap<Integer,Integer> h1, StringBuilder s){
        if(d==tiles.length()){
            String a = s.toString();
            String r = s.reverse().toString();
            if(h.containsKey(a)==false){
                h.put(a,1);
            }
            if(h.containsKey(r)==false){
                    h.put(r,1);
            }
            return;
        }
        for(int i=0;i<tiles.length();i++){
            if(h1.containsKey(i)==false){
                h1.put(i,1);
                s.append(String.valueOf(tiles.charAt(i)));
                perm(tiles,d+1,h1,new StringBuilder(s));
                s.deleteCharAt(s.length()-1);
                h1.remove(i);
            }
        }

    }
    public int numTilePossibilities(String tiles) {
        subsequence(tiles,0,new StringBuilder());
        perm(tiles,0,new HashMap<Integer,Integer>(), new StringBuilder());
        return h.size();
    }
}
