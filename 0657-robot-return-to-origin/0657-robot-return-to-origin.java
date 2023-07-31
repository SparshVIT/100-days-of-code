class Solution {
    public boolean judgeCircle(String moves) {
        int k = 0;
        int j = 0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                k--;
            }
            else if(moves.charAt(i)=='D'){
                k++;
            }
            else if(moves.charAt(i)=='L'){
                j--;
            }
            else if(moves.charAt(i)=='R'){
                j++;
            }
        }
        if(k==0 && j==0){
            return true;
        }
        return false;
    }
}