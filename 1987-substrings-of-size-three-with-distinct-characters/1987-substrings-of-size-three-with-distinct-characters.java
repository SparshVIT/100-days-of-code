class Solution {
    public int countGoodSubstrings(String s) {
        int i = 0;
        int count = 0;
        while(i<s.length()-2){
            boolean visit[] = new boolean[26];
            int j = i;
            //int count = 0;
            while(j<i+3){
                int d = s.charAt(j)-'a';
                if(visit[d]==true){
                    break;
                }
                else{
                    visit[d] = true;
                }
                j++;
            }
            if(j==i+3){
                count++;
            }
            i++;
        }
        return count;
    }
}