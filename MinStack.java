class MinStack {
    Stack<Integer> s;
    PriorityQueue<Integer> p = new PriorityQueue<>();
    public MinStack() {
        s = new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        p.add(val);
    }
    
    public void pop() {
        int d = s.pop();
        p.remove(d);
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return p.peek();
    }
}
