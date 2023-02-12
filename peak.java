class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int peak = 0;
        boolean gotpeak = false;
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]>arr[i-1]){
                peak = i;
                gotpeak = true;
                break;
            }
        }
        if(gotpeak==false){
            return 0;
        }
        return peak;
    }
}
