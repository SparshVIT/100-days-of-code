class Solution {
    public void toup(int[][] matrix, int r, int c){
        if(r<0){
            return;
        }
        toup(matrix, r-1, c);
        matrix[r][c] = 0;
    }
    public void todown(int[][] matrix, int r, int c, int l){
        if(r>=l){
            return;
        }
        todown(matrix, r+1, c, l);
        matrix[r][c] = 0;
    }
    public void toleft(int[][] matrix, int r, int c){
        if(c<0){
            return;
        }
        toleft(matrix, r, c-1);
        matrix[r][c] = 0;
    }
    public void toright(int[][] matrix, int r, int c, int l){
        if(c>=l){
            return;
        }
        toright(matrix, r, c+1, l);
        matrix[r][c] = 0;
    }
    public void setZeroes(int[][] matrix) {
       List<List<Integer>> l = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    List<Integer> l1 = new ArrayList<>();
                    l1.add(i);
                    l1.add(j);
                    l.add(l1);
                }
            }
        }
        for(int i=0;i<l.size();i++){
            int r = l.get(i).get(0);
            int c = l.get(i).get(1);
            toup(matrix, r, c);
            todown(matrix, r, c, matrix.length);
            toleft(matrix, r, c);
            toright(matrix, r, c, matrix[0].length);
        }
    }
}
public class setzero {
    public static void main(String args[]) {
      Solution s = new Solution();
      
    }
}