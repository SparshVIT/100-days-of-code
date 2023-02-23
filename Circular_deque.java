class MyCircularDeque {
    Deque<Integer> d;
    int capacity = 0;
    public MyCircularDeque(int k) {
        d = new ArrayDeque<>();
        capacity = k;
    }
    
    public boolean insertFront(int value) {
        if(d.size()==capacity){
            return false;
        }
        if(d.offerFirst(value)){
            return true;
        }
        return false;
    }
    
    public boolean insertLast(int value) {
        if(d.size()==capacity){
            return false;
        }
        if(d.offerLast(value)){
            return true;
        }
        return false;
    }
    
    public boolean deleteFront() {
        if(d.pollFirst()!=null){
            return true;
        }
        return false;
    }
    
    public boolean deleteLast() {
        if(d.pollLast()!=null){
            return true;
        }
        return false;
    }
    
    public int getFront() {
        if(d.size()==0){
            return -1;
        }
        return d.peekFirst();
    }
    
    public int getRear() {
        if(d.size()==0){
            return -1;
        }
        return d.peekLast();
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
