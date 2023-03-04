class MyHashMap {
    ArrayList<Integer> a;
    ArrayList<Integer> b;
    public MyHashMap() {
        a = new ArrayList<>();
        b = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        int c = a.indexOf(key);
        if(c>=0){
            b.set(c,value);
        }
        else{
            a.add(key);
            b.add(value);
        }
    }
    
    public int get(int key) {
        int c = a.indexOf(key);
        if(c>=0){
            return b.get(c);
        }
        return -1;
    }
    
    public void remove(int key) {
        int c = a.indexOf(key);
        if(c>=0){
            a.remove(c);
            b.remove(c);
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
