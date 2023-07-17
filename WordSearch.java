class Solution {
    boolean check = false;
    public void find(char[][] board, int i, int j, String word, String n, int[][] visit){
        if(i>=board.length || j>=board[0].length){
            if(n.equals(word)){
                check = true;
            }
            return;
        }
        if(n.length()==word.length()){
            if(n.equals(word)){
                check = true;
            }
            return;
        }
        if(check == true){
            return;
        }
        n = n+board[i][j];
        if(n.length()==word.length()){
            if(n.equals(word)){
                check = true;
            }
            return;
        }
        if(i-1>=0 && visit[i-1][j]==0){
            visit[i][j] = 1;
            find(board,i-1,j,word,n,visit);
            visit[i][j] = 0;
        }
        if(i+1<board.length && visit[i+1][j]==0){
            visit[i][j] = 1;
            find(board,i+1,j,word,n,visit);
            visit[i][j] = 0;
        }
        if(j-1>=0 && visit[i][j-1]==0){
            visit[i][j] = 1;
            find(board,i,j-1,word,n,visit);
            visit[i][j] = 0;
        }
        if(j+1<board[0].length && visit[i][j+1]==0){
            visit[i][j] = 1;
            find(board,i,j+1,word,n,visit);
            visit[i][j] = 0;
        }
    }
    public boolean exist(char[][] board, String word) {
        if(board.length==1 && board[0].length==1){
            String s1 = String.valueOf(board[0][0]);
            if(s1.equals(word)){
                return true;
            }
            return false;
        }
        int visit[][] = new int[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                visit[i][j] = 0;
            }
        }
        for(int i = 0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    if(check == true){
                        break;
                    }
                    find(board,i,j,word,"",visit);
                }
            }
            if(check==true){
                break;
            }
        }
        return check;
    }
}
