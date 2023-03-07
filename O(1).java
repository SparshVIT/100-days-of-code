class AllOne {
    PriorityQueue<String> p1;
    PriorityQueue<String> p2;
    HashMap<String, Integer> h;
    public AllOne() {
        h = new HashMap<>();
       p1 = new PriorityQueue<>((a,b)->h.get(a)==h.get(b)?a.compareTo(b):h.get(b)-h.get(a));
       p2 = new PriorityQueue<>((a,b)->h.get(a)==h.get(b)?a.compareTo(b):h.get(a)-h.get(b));
    }
    
    public void inc(String key) {
        if(h.containsKey(key)){
            h.put(key,h.get(key)+1);
            p1.remove(key);
            p1.add(key);
            p2.remove(key);
            p2.add(key);
        }
        else{
            h.put(key,1);
            p1.add(key);
            p2.add(key);
        }
    }
    
    public void dec(String key) {
        h.put(key,h.get(key)-1);
        p1.remove(key);
        p1.add(key);
        p2.remove(key);
        p2.add(key);
        if(h.get(key)==0){
            h.remove(key);
            p1.remove(key);
            p2.remove(key);
        }
    }
    
    public String getMaxKey() {
        if(p1.size()==0){
            return "";
        }
        return p1.peek();
    }
    
    public String getMinKey() {
        if(p2.size()==0){
            return "";
        }
        return p2.peek();
    }
}
