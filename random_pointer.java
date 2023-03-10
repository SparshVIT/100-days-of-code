class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Integer,Node> h = new HashMap<>();
        int k=0;
        Node temp = head;
        ArrayList<Node> l = new ArrayList<>();
        while(temp!=null){
            h.put(k,temp.random);
            k++;
            l.add(temp);
            temp = temp.next;
        }
        if(k==0){
            return head;
        }
        ArrayList<Node> a = new ArrayList<>();
        temp = head;
        while(temp!=null){
            Node t = new Node(temp.val);
            a.add(t);
            temp = temp.next;
        }
        for(int i=0;i<a.size();i++){
            Node n = h.get(i);
            if(n==null){
                a.get(i).random = null;
            }
            else{
                int index = l.indexOf(n);
                a.get(i).random = a.get(index);
            }
        }
        Node head1 = new Node(0);
        temp = null;
        int m =0;
        for(int i=0;i<a.size();i++){
            if(m==0){
                head1 = a.get(i);
                temp = head1;
                m++;
            }
            else{
                Node t = a.get(i);
                temp.next = t;
                temp = t;
            }
        }
        if(temp!=null){
            temp.next = null;
        }
        return head1;
    }
}
