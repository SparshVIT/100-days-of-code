class Solution {
    public boolean isPossible(int weights[], int days, int total){
        int days_to_complete = 1;
        int weight = 0;
        for(int i=0;i<weights.length;i++){
            if(weight+weights[i]>total){
                days_to_complete ++;
                weight = 0;
            }
            weight = weight+weights[i];
        }
        if(days_to_complete>days){
            return false;
        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int lower = 0;
        int higher = 0;
        for(int i=0;i<weights.length;i++){
            lower = Math.max(weights[i], lower);
            higher += weights[i]; 
        }
        int result = higher;
        while(lower<=higher){
            int mid = lower +(higher-lower)/2;
            if(isPossible(weights, days, mid)){
                result = mid;
                higher = mid-1;
            }
            else{
                lower = mid+1;
            }
        }
        return result;
    }
}
