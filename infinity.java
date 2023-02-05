class SmallestInfiniteSet {
    PriorityQueue<Integer> a;
    public SmallestInfiniteSet() {
        a = new PriorityQueue<>();
        for(int i=1;i<10000;i++){
            a.add(i);
        }
    }
    
    public int popSmallest() {
        return a.remove();
    }
    
    public void addBack(int num) {
        if(a.contains(num)==false){
            a.add(num);
        }
    }
}
