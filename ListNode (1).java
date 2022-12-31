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
    public ListNode sortList(ListNode head) {
        PriorityQueue<Integer> s = new PriorityQueue<>();
		ListNode temp = head;
		while(temp!=null){
		    s.add(temp.val);
		    temp = temp.next;
		}
		temp = head;
		while(s.size()>0){
		    temp.val = s.poll();
		    temp = temp.next;
		}
		return head;
    }
}
public class SortList {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}