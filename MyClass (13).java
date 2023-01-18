class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int a = nums[i];
            if(h.containsKey(a)){
                h.put(a,h.get(a)+1);
            }
            else{
                h.put(a,1);
            }
        }
        int arr[] = new int[k];

        for(int i=0;i<k;i++){
            int max = 0;
            int key = 0;
            for(int j: h.keySet()){
                if(h.get(j)>max){
                    max = h.get(j);
                    key = j;
                }
            }
            arr[i] = key;
            h.remove(key);
        }
        return arr;
    }
}
public class MyClass {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}