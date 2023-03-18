class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashMap<Character,Integer> h = new HashMap<>();
        for(int i=0;i<allowed.length();i++){
            char c = allowed.charAt(i);
            h.put(c,1);
        }
        int count = 0;
        for(int i=0;i<words.length;i++){
            String s = words[i];
            boolean check = true;
            for(int j=0;j<s.length();j++){
                char c = s.charAt(j);
                if(h.containsKey(c)==false){
                    check = false;
                }
            }
            if(check==true){
                count++;
            }
        }
        return count;
    }
}
