class FrontMiddleBackQueue {
    List<Integer> q;
    public FrontMiddleBackQueue() {
        q = new LinkedList<>();
    }
    
    public void pushFront(int val) {
        q.add(0,val);
    }
    
    public void pushMiddle(int val) {
        int mid = q.size()/2;
        q.add(mid,val);
    }
    
    public void pushBack(int val) {
        q.add(val);
    }
    
    public int popFront() {
        if(q.size()!=0){
            int a = q.get(0);
            q.remove(0);
            return a;
        }
        return -1;
    }
    
    public int popMiddle() {
        if(q.size()!=0){
           int mid = 0 + (q.size()-1)/2;
           int a = q.get(mid);
           q.remove(mid);
           return a;
        }
        return -1;
    }
    
    public int popBack() {
        if(q.size()!=0){
            int a = q.get(q.size()-1);
            q.remove(q.size()-1);
            return a;
        }
        return -1;
    }
}
