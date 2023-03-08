class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> h = new HashMap<>();
        PriorityQueue<Integer> p = new PriorityQueue<>((a,b)->{
            int f = h.get(a)-h.get(b);
            if(f==0){
                return a-b;
            }
            return f;
        });
        for(int i=0;i<arr.length;i++){
            int a = arr[i];
            if(h.containsKey(a)){
                h.put(a,h.get(a)+1);
            }
            else{
                h.put(a,1);
            }
        }
        for(int i=0;i<arr.length;i++){
            p.add(arr[i]);
        }
        HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<k;i++){
            p.remove();
        }
        while(p.size()!=0){
            s.add(p.remove());
        }
        return s.size();

    }
}
