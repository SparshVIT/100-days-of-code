class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int p1 = mat.length*mat[0].length;
        int p2 = r*c;
        if(p1!=p2){
            return mat;
        }
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                a.add(mat[i][j]);
            }
        }
        int mat2[][]  = new int[r][c];
        int k = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat2[i][j] = a.get(k);
                k++;
            }
        }
        return mat2;
    }
}
public class MyClass {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}