class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ArrayList<Integer> a = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            a.add(temp.val);
            temp = temp.next;
        }
        int i = k-1;
        int j = (a.size()-1)-(k-1);
        int temp2 = a.get(i);
        a.set(i,a.get(j));
        a.set(j,temp2);
        ListNode head1 = new ListNode(0);
        ListNode temp1 = null;
        int m = 0;
        for(int x=0;x<a.size();x++){
            if(m==0){
                head1.val = a.get(x);
                temp1 = head1;
                m++;
            }
            else{
                ListNode t = new ListNode(a.get(x));
                temp1.next = t;
                temp1 = t;
            }
        }
        if(temp1!=null){
            temp1.next = null;
        }
        return head1;
    }
}
