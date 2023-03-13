class Solution {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character,Integer> h = new HashMap<>();
        for(int i=0;i<sentence.length();i++){
            char c = sentence.charAt(i);
            h.put(c,1);
        }
        char c = 'a';
        boolean check = true;
        while(c<='z'){
            if(h.containsKey(c)==false){
                check = false;
                break;
            }
            c++;
        }
        return check;
    }
}
