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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int length = 0;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        int pos = length-n;
        temp = head;
        if(length==1){
            return null;
        }
        if(n==length){
            temp = temp.next;
            head = temp;
            return head;
        }
        if(n==1){
            for(int i=1;i<pos;i++){
                temp = temp.next;
            }
            temp.next = null;
        }
        else{
            for(int i=1;i<pos;i++){
                temp = temp.next;
            }
            ListNode t = temp.next;
            temp.next = t.next;
        }

        return head;
    }
}
public class MyClass {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}