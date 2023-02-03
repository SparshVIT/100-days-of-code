class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        int length = 0;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        if(length==0 || length==1){
            return null;
        }
        ListNode d = new ListNode(0);
        d.next = head;
        int mid = length/2;
        temp = head;
        for(int i=0;i<mid-1;i++){
            temp = temp.next;
        }
        ListNode t = temp.next;
        if(t!=null){
            temp.next = t.next;
        }
        return head;
    }
}
