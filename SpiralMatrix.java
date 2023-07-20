class Solution {
    List<Integer> m = new ArrayList<>();
    public void fr(int[][] matrix, int r, int c, int[][] v){
        if((r>=matrix.length || r<0) || (c>=matrix[0].length || c<0)){
            return;
        }
        if(v[r][c]!=-1){
            return;
        }
        if(c==matrix[0].length-1 || (v[r][c+1]!=-1)){
            m.add(matrix[r][c]);
            v[r][c] = 1;
            fd(matrix,r+1,c,v);
            return;
        }
        m.add(matrix[r][c]);
        v[r][c] = 1;
        fr(matrix,r,c+1,v);
    }
    public void fd(int[][] matrix, int r, int c, int[][] v){
        if((r>=matrix.length || r<0) || (c>=matrix[0].length || c<0)){
            return;
        }
        if(v[r][c]!=-1){
            return;
        }
        if(r==matrix.length-1 || (v[r+1][c]!=-1)){
            m.add(matrix[r][c]);
            v[r][c] = 1;
            fl(matrix,r,c-1,v);
            return;
        }
        m.add(matrix[r][c]);
        v[r][c] = 1;
        fd(matrix,r+1,c,v);
    }
    public void fl(int[][] matrix, int r, int c, int[][] v){
        if((r>=matrix.length || r<0) || (c>=matrix[0].length || c<0)){
            return;
        }
        if(v[r][c]!=-1){
            return;
        }
        if(c==0 || (v[r][c-1]!=-1)){
            m.add(matrix[r][c]);
            v[r][c] = 1;
            fu(matrix,r-1,c,v);
            return;
        }
        m.add(matrix[r][c]);
        v[r][c] = 1;
        fl(matrix,r,c-1,v);
    }
    public void fu(int[][] matrix, int r, int c, int[][] v){
        if((r>=matrix.length || r<0) || (c>=matrix[0].length || c<0)){
            return;
        }
        if(v[r][c]!=-1){
            return;
        }
        if(r==0|| (v[r-1][c]!=-1)){
            m.add(matrix[r][c]);
            v[r][c] = 1;
            fr(matrix,r,c+1,v);
            return;
        }
        m.add(matrix[r][c]);
        v[r][c] = 1;
        fu(matrix,r-1,c,v);
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int v[][] = new int[matrix.length][matrix[0].length];
        for(int i=0;i<v.length;i++){
            for(int j=0;j<v[0].length;j++){
                v[i][j] = -1;
            }
        }
        fr(matrix,0,0,v);
        return m;
    }
}
