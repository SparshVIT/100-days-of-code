class SeatManager {
    PriorityQueue<Integer> p;
    HashMap<Integer,String> h;
    public SeatManager(int n) {
        p = new PriorityQueue<>();
        h = new HashMap<>();
        for(int i=1;i<=n;i++){
            h.put(i,"unreserved");
            p.add(i);
        }
    }
    
    public int reserve() {
        int a = p.remove();
        h.put(a,"reserved");
        return a;
    }
    
    public void unreserve(int seatNumber) {
        p.add(seatNumber);
        h.put(seatNumber,"unreserved");
    }
}
