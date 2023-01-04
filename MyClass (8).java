class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            p.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            p.add(nums2[i]);
        }
        while(p.size()!=0){
            a.add(p.remove());
        }
        double median = 0.00;
        if(a.size()%2!=0){
            median =(double) a.get(a.size()/2);
        }
        else{
            int index1 = a.size()/2;
            int index2 = (a.size()/2)-1;
            median = (double) (a.get(index1)+a.get(index2))/2;
        }
        median = Math.round(median * 10000000) / 10000000.0;
        return median;
    }
}
public class MyClass {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}