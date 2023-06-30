class Solution {
    public String convert(String s, int numRows) {
        ArrayList<ArrayList<Character>> c = new ArrayList<>();
        if(numRows==1){
            return s;
        }
        for(int i=0;i<numRows;i++){
            ArrayList<Character> l = new ArrayList<>();
            c.add(l);
        }
        int n = 0;
        int button = 1;
        int i = 0;
        while(n<s.length()){
            if(button==1){
                c.get(i).add(s.charAt(n));
                i++;
                if(i==numRows){
                    i = i-2;
                    button=2;
                }
            }
            else if(button==2){
                c.get(i).add(s.charAt(n));
                i--;
                if(i<0){
                    i = 1;
                    button=1;
                }
            }
            n++;
        }
        String s1 = "";
        ArrayList<Character> a = new ArrayList<>();
        for(int j=0;j<numRows;j++){
            a.addAll(c.get(j));
        }
        for(int j=0;j<a.size();j++){
            s1 = s1+String.valueOf(a.get(j));
        }
        return s1;
    }
}
