class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for(int i=0;i<words.length;i++){
            String word = words[i];
            if(word.indexOf(pref)==0){
                count++;
            }
        }
        return count;
    }
}
