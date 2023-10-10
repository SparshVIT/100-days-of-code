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
    public void reorderList(ListNode head) {
        List<ListNode> l = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            l.add(temp);
            temp = temp.next;
        }
        int i = 1;
        int j = l.size()-1;
        int s = 1;
        temp = l.get(0);
        while(i<=j){
            if(s==0){
                temp.next = l.get(i);
                i++;
                temp = temp.next;
                s = 1;
            }
            else{
                temp.next = l.get(j);
                j--;
                temp = temp.next;
                s = 0;
            }
        }
        temp.next = null;
    }
}