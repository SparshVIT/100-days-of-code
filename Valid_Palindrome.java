class Solution {
    public boolean isPalindrome(String s) {
        String a = s.toLowerCase();
        String a1 = "";
        if(s.length()==0){
            return true;
        }
        for(int i=0;i<a.length();i++){
            char c = a.charAt(i);
            if(('a'<=c && c<='z') || ('0'<=c && c<='9')){
                a1+= String.valueOf(c);
            }
        }
        int i = 0;
        int j = a1.length()-1;
        boolean result = true;
        while(i<=j){
            char c = a1.charAt(i);
            char d = a1.charAt(j);
            if(c!=d){
                result = false;
                break;
            }
            i++;
            j--;
        }
        return result;
    }
}
