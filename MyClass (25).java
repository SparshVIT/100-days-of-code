class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> l = new ArrayList<>();
        int index = 0;
        boolean isit = false;
        for(int i=0;i<intervals.length;i++){
            if(newInterval[1]<intervals[i][0]){
                l.add(newInterval);
                index = i;
                isit = true;
                break;
            }
            else if(newInterval[0]>intervals[i][1]){
                l.add(intervals[i]);
            }
            else{
                newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
                newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            }
        }
        if(isit){
            for(int i=index;i<intervals.length;i++){
                l.add(intervals[i]);
            }
        }
        else{
            l.add(newInterval);
        }
        return l.toArray(new int[l.size()][2]);
    }
}
public class MyClass {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}