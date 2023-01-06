class Solution {
    public void rotate(int[][] matrix) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=matrix.length-1;i>=0;i--){
            for(int j=0;j<matrix[i].length;j++){
                a.add(matrix[i][j]);
            }
        }
        int member = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[j][i] = a.get(member);
                member++;
            }
        }
    }
}
public class Rotate_Image {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}