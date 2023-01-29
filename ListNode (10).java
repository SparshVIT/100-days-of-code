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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode d = new ListNode(0);
        d.next = list1;
        ListNode temp = d;
        int i=0;
        while(i<a){
            temp = temp.next;
            i++;
        }
        i = 0;
        ListNode temp2 = d;
        while(i<=b){
            temp2 = temp2.next;
            i++;
        }
        ListNode temp3 = list2;
        while(temp3.next!=null){
            temp3 = temp3.next;
        }
        temp.next = list2;
        temp3.next = temp2.next;
        return d.next;
    }
}
public class Merge {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}