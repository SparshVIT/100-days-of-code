class Node{
    int val;
    Node next;
    Node(int d){
        val = d;
    }
}
class Solution
{
    Node f = new Node(0);
    public void j(Node head, int k){
        if(head.next == head){
            f = head;
            return;
        }
        Node temp = head;
        int i =1;
        while(i<k-1){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        j(temp.next,k);
    }
   public int josephus(int n, int k)
    {
        //Your code here
        if(k==1){
            return n;
        }
        Node head = new Node(1);
        Node temp = head;
        for(int i=2;i<=n;i++){
            Node t = new Node(i);
            temp.next = t;
            temp  = t;
        }
        temp.next = head;
        j(head,k);
        return f.val;
    }

}

