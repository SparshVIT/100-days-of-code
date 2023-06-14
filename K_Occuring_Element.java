class Solution
{
    public int firstElementKTime(int[] a, int n, int k) { 
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(h.containsKey(a[i])){
                h.put(a[i],h.get(a[i])+1);
                if(h.get(a[i])==k){
                    return a[i];
                }
            }
            else{
                h.put(a[i],1);
                if(h.get(a[i])==k){
                    return a[i];
                }
            }
        }
        return -1;
        
    } 
}
