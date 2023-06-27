class Sol
{
	public static Node findUnion(Node head1,Node head2)
	{
	    //Add your code here.
	    Node temp = head1;
	    TreeSet<Integer> h = new TreeSet<>();
	    while(temp!=null){
	        h.add(temp.data);
	        temp  = temp.next;
	    }
	    temp = head2;
	    while(temp!=null){
	        h.add(temp.data);
	        temp = temp.next;
	    }
	    Node head3 = new Node(0);
	    Node temp1 = null;
	    int m = 0;
	    for(int i: h){
	        if(m==0){
	            head3.data = i;
	            temp1 = head3;
	            m++;
	        }
	        else{
	            Node t = new Node(i);
	            temp1.next = t;
	            temp1 = t;
	        }
	    }
	    if(temp1.next!=null){
	        temp1.next = null;
	    }
	    return head3;
	}
}
