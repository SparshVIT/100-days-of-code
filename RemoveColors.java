class Solution {
    public boolean winnerOfGame(String colors) {
        List<Integer> a = new ArrayList<>();
        for(int i=1;i<colors.length()-1;i++){
            if(colors.charAt(i)=='A'){
                if(colors.charAt(i-1)=='A' && colors.charAt(i+1)=='A'){
                    a.add(i);
                }
            }
        }
        if(a.size()==0){
            return false;
        }
        List<Integer> b = new ArrayList<>();
        for(int i=1;i<colors.length()-1;i++){
            if(colors.charAt(i)=='B'){
                if(colors.charAt(i-1)=='B' && colors.charAt(i+1)=='B'){
                    b.add(i);
                }
            }
        }
        if(b.size()==0){
            return true;
        }
        int chance = 0;
        while(a.size()!=0 && b.size()!=0){
            if(chance==0){
                a.remove(0);
                chance = 1;
            }
            else if(chance==1){
                b.remove(0);
                chance = 0;
            }
        }
        if(a.size()==0){
            return false;
        }
        return true;

    }
}
