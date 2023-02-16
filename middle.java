class Solution {
    public ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            length++;
        }
        int mid = length/2;
        int i=0;
        temp = head;
        while(i<mid){
            temp = temp.next;
            i++;
        }
        return temp;
    }
}
