class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
    }
}
class Solution {
    HashMap<Integer,Integer> h = new HashMap<>();
    Node currNode = null;
    public void t(Node t1, Node t2, List<Node> l){
        if(currNode == null){
            h.put(t1.data,h.get(t1.data)+1);
        }
        t1 = t1.next;
        while(t1!=null && t1.data!=t2.data){
            h.put(t1.data,h.get(t1.data)+1);
            t1 = t1.next;
        }
        h.put(t2.data,h.get(t2.data)+1);
        currNode = t2;
    }
    public List<Integer> mostVisited(int n, int[] rounds) {
        List<Node> l = new ArrayList<>();
        Node head = new Node(1);
        h.put(1,0);
        Node temp = head;
        l.add(temp);
        for(int i=2;i<=n;i++){
            Node t = new Node(i);
            h.put(i,0);
            temp.next = t;
            temp = t;
            l.add(temp);
        }
        temp.next = head;
        for(int i=1;i<rounds.length;i++){
            Node t1 = l.get(rounds[i-1]-1);
            Node t2 = l.get(rounds[i]-1);
            t(t1,t2,l);
        }
        int max = Integer.MIN_VALUE;
        for(int k: h.keySet()){
            if(h.get(k)>max){
                max = h.get(k);
            }
        }
        List<Integer> l1 = new ArrayList<>();
        System.out.println(max);
        for(int k: h.keySet()){
            if(h.get(k)==max){
                l1.add(k);
            }
        }
        Collections.sort(l1);
        return l1;
    }
}