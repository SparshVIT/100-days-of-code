

//User function Template for Java

class Solution {
    void convert(int[] arr, int n) {
        //Code here
        Map<Integer,Integer> t = new TreeMap<>();
        for(int i=0;i<n;i++){
            t.put(arr[i],i);
        }
        int j=0;
        for(Map.Entry<Integer, Integer> e: t.entrySet()){
            int value = e.getValue();
            arr[value] = j;
            j++;
        }
        
    }
}
public class reduced {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}