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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode d = new ListNode(0);
        d.next = head;
        ListNode temp = d.next;
        int length = 0;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        if(length==0 || length==1){
            return head;
        }
        int i = 0;
        String k1 = String.valueOf(k);
        if(k1.length()>=9){
            k = (int)(k/Math.pow(10,8));
        }
        while(i<k){
            temp = d;
            int l = 0;
            while(l<length-1){
                l++;
                temp = temp.next;
            }
            ListNode prev = temp;
            ListNode curr = prev.next;
            curr.next = d.next;
            d.next = curr;
            if(prev!=null){
                prev.next = null;
            }
            i++;

        }
        return d.next;
    }
}
public class RotateList {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}