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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        if(lists.length==1 && lists[0]==null){
            return null;
        }
        
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for(int i=0;i<lists.length;i++){
            ListNode temp = lists[i];
            if(temp==null){
                continue;
            }
            while(temp!=null){
                p.add(temp.val);
                temp = temp.next;
            }
        }
        if(p.size()==0){
            return null;
        }
        ListNode h = new ListNode(0);
        ListNode t = null;
        int m = 0;
        while(p.size()!=0){
            if(m==0){
                h.val = p.remove();
                t = h;
                m++;
            }
            else{
                ListNode t1 = new ListNode(p.remove());
                t.next = t1;
                t = t1;
            }
        }
        if(t!=null){
            t.next = null;
        }
        return h;

    }
}
