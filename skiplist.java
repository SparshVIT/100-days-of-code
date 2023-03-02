class Skiplist {
    PriorityQueue<Integer> p;
    public Skiplist() {
        p = new PriorityQueue<>();
    }
    
    public boolean search(int target) {
        return p.contains(target);
    }
    
    public void add(int num) {
        p.add(num);
    }
    
    public boolean erase(int num) {
        if(p.contains(num)){
            p.remove(num);
            return true;
        }
        return false;
    }
}
