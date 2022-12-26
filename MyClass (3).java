class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> h =new HashMap<>();
        int size = arr.length;
        for(int i=0;i<size;i++){
            int a = arr[i];
            if(h.containsKey(a)){
                h.put(a,h.get(a)+1);
            }
            else{
                h.put(a,1);
            }
        }
        boolean result = true;
        Set<Integer> s = new HashSet<>();
        for(int i: h.keySet()){
            int v = h.get(i);
            if(s.add(v)==false){
                result = false;
                break;
            }
            else{
                s.add(v);
            }
        }
        return result;
        
    }
}
public class MyClass {
    public static void main(String args[]) {
      Soultion s = new Solution();
    }
}