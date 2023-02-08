class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<image.length;i++){
            for(int j = image[0].length-1;j>=0;j--){
                a.add(image[i][j]);
            }
        }
        int k = 0;
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){
                if(a.get(k)==0){
                    image[i][j] = 1;
                }
                else{
                    image[i][j]=0;
                }
                k++;
            }
        }
        return image;
    }
}
