class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, (a,b)->(a[k]-b[k]));
        int i = 0;
        int j = score.length-1;
        while(i<j){
            int arr[] = score[i];
            score[i] = score[j];
            score[j] = arr;
            i++;
            j--;
        }
        return score;
    }
}
