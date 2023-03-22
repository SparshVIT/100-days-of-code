class Solution {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        String h1 = s.substring(0,s.length()/2);
        String h2 = s.substring(s.length()/2,s.length());
        int v1 = 0;
        int v2 = 0;
        for(int i=0;i<h1.length();i++){
            char c = h1.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                v1++;
            }
        }
        for(int i=0;i<h2.length();i++){
            char c = h2.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                v2++;
            }
        }
        if(v1==v2){
            return true;
        }
        return false;
    }
}
