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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        ListNode temp = list1;
        int length1 = 0;
        int length2 = 0;
        while(temp!=null){
            p.add(temp.val);
            temp = temp.next;
            length1++;
        }
        temp  = list2;
        while(temp!=null){
            p.add(temp.val);
            temp = temp.next;
            length2++;
        }
        if(length1==0 && length2==0){
            return null;
        }
        ListNode list3 = new ListNode(p.remove());
        temp = list3;
        while(p.size()>0){
            ListNode temp1 = new ListNode(p.remove());
            temp.next = temp1;
            temp = temp1;
        }
        return list3;
    }
}
public class mergeList {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}