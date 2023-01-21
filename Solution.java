/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode temp = head;
        ListNode result = null;
        HashMap<ListNode, Integer> l = new HashMap<>();
        int i = 0;
        while(temp!=null){
            if(l.containsKey(temp)){
                result = temp;
                break;
            }
            else{
                l.put(temp,i);
            }
            temp = temp.next;
            i++;
        }
        return result;
    }
}
public class MyClass {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}