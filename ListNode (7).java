/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode, Integer> h = new HashMap<>();
        ListNode temp = headA;
        while(temp!=null){
            h.put(temp,1);
            temp = temp.next;
        }
        temp = headB;
        ListNode result = null;
        while(temp!=null){
            if(h.containsKey(temp)){
                result = temp;
                break;
            }
            else{
                h.put(temp,1);
                temp = temp.next;
            }
        }
        return result;
    }
}
public class MyClass {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}