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
    public ListNode deleteDuplicates(ListNode head) {
        HashMap<Integer,Integer> h = new HashMap<>();
        ListNode temp = head;
        while(temp!=null){
            if(h.containsKey(temp.val)){
                h.put(temp.val, h.get(temp.val)+1);
            }
            else{
                h.put(temp.val,1);
            }
            temp = temp.next;
        }
        ListNode head1 = null;
        ListNode temp1 = null;
        int member = 1;
        temp = head;
        int m = 0;
        while(temp!=null){
            if(h.get(temp.val)==1){
                if(m==0){
                    head1 = temp;
                    temp1 = head1;
                    m++;
                }
                else{
                    temp1.next = temp;
                    temp1 = temp;
                }
            }
            temp = temp.next;
        }
        if(temp1!=null){
            temp1.next = null;
        }
        return head1;
    }
}
public class MyClass {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}