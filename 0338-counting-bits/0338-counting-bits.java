class Solution {
    public int[] countBits(int n) {
        int arr[] = new int[n+1];
        for(int i=0;i<=n;i++){
            int count = 0;
            int d = i;
            while(d>0){
                if((d&1)==1){
                    count++;
                }
                d = d/2;
            }
            arr[i] = count;
        }
        return arr;
    }
}