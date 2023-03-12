class LRUCache {
    HashMap<Integer,Integer> h;
    ArrayList<Integer> a = new ArrayList<>();
    int total = 0;
    public LRUCache(int capacity) {
        h = new HashMap<>();
        total = capacity;

    }
    
    public int get(int key) {
        if(total==0){
            return -1;
        }
        if(h.containsKey(key)){
            a.remove(Integer.valueOf(key));
            a.add(key);
            return h.get(key);
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(total ==0 ){
            return;
        }
        if(h.containsKey(key)){
            a.remove(Integer.valueOf(key));
            a.add(key);
            h.put(key,value);
        }
        else{
            h.put(key,value);
            a.add(key);
        }
        if(h.size()>total){
            int a1 = a.get(0);
            h.remove(a1);
            a.remove(0);
        }
        
    }
}
