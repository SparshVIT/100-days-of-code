class MyCircularQueue {
    Deque<Integer> d;
    int capacity;
    public MyCircularQueue(int k) {
        d = new ArrayDeque<>();
        capacity = k;
    }
    
    public boolean enQueue(int value) {
        if(d.size()<capacity){
            d.add(value);
            return true;
        }
        return false;
    }
    
    public boolean deQueue() {
        if(d.size()>0){
            d.poll();
            return true;
        }
        return false;
    }
    
    public int Front() {
        if(d.size()!=0){
            return d.peekFirst();
        }
        return -1;
    }
    
    public int Rear() {
        if(d.size()!=0){
            return d.peekLast();
        }
        return -1;
    }
    
    public boolean isEmpty() {
        if(d.size()==0){
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if(d.size()==capacity){
            return true;
        }
        return false;
    }
}
