class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        int hindex = m-1;
        int lindex = 0;
        long min = a.get(hindex)-a.get(lindex);
        
        hindex++;
        lindex++;
        while(hindex<n){
            long diff = a.get(hindex)-a.get(lindex);
            if(min>diff){
                min = diff;
            }
            hindex++;
            lindex++;
        }
        return min;
    }
}
public class MyClass {
    public static void main(String args[]) {
     Solution S = new Solution();
     
    }
}