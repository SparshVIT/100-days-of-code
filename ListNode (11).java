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
    public int getDecimalValue(ListNode head) {
        String s = "";
        ListNode temp = head;
        while(temp!=null){
            s = s+String.valueOf(temp.val);
            temp = temp.next;
        }
        return Integer.parseInt(s,2);
    }
}
public class MyClass {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}