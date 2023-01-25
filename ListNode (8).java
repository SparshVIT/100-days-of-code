/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode temp = head;
        int length = 0;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        if(length==0 || length==1){
            return head;
        }
        ListNode d = new ListNode(0);
        d.next = head;
        ListNode odd = d.next;
        ListNode even = odd.next;
        temp = even.next;
        while(temp!=null && even!=null){
            even.next = temp.next;
            temp.next = odd.next;
            odd.next = temp;
            odd = temp;
            even = even.next;
            if(even!=null){
                temp = even.next;
            }
        }
        return d.next;
    }
}
public class MyClass {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}