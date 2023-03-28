class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev  = null;
        ListNode temp = head;
        while(temp!=null){
            ListNode t = temp.next;
            temp.next = prev;
            prev = temp;
            temp = t;
        }
        head = prev;
        return prev;
    }
}
