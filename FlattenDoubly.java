class Solution {
    ArrayList<Node> a = new ArrayList<>();
    public void fill(Node head){
        if(head==null){
            return;
        }
        a.add(head);
        fill(head.child);
        fill(head.next);
    }
    public Node flatten(Node head) {
        if(head==null){
            return null;
        }
        fill(head);
        Node h = a.get(0);
        h.prev = null;
        h.child = null;
        Node temp = h;
        for(int i=1;i<a.size();i++){
            Node t = a.get(i);
            temp.next = t;
            t.prev = temp;
            t.child = null;
            temp = t;
        }
        temp.next = null;
        return h;
    }
}
