class Solution {
    public String makeSmallestPalindrome(String s) {
        char c[] = new char[s.length()];
        int i = 0;
        int j = s.length()-1;
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                c[i] = c[j] = s.charAt(i);
            }
            else{
                if(s.charAt(i)<s.charAt(j)){
                    c[i] = c[j] = s.charAt(i);
                }
                else{
                    c[i] = c[j] = s.charAt(j);
                }
            }
            i++;
            j--;
        }
        String s1 = "";
        for(char c1: c){
            s1 += String.valueOf(c1);
        }
        return s1;

    }
}