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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        List<Integer> l = new ArrayList<>();
        while(temp!=null){
            l.add(temp.val);
            temp = temp.next;
        }
        List<Integer> l1 = new ArrayList<>();
        int i=0;
        if(l.size()<k){
            l1.addAll(l);
        }
        else{
            while(i<l.size()){
                List<Integer> a;
                if(l.size()-i>=k){
                    a = l.subList(i,i+k);
                    Collections.reverse(a);
                    l1.addAll(a);
                    i = i+k;
                }
                else{
                    a = l.subList(i,l.size());
                    l1.addAll(a);
                    i = i+(l.size()-i);
                }
            }
        }
        ListNode head1 = new ListNode(0);
        ListNode t1 = null;
        int m = 0;
        for(int j=0;j<l1.size();j++){
            if(m==0){
                head1.val = l1.get(j);
                t1 = head1;
                m++;
            }
            else{
                ListNode t = new ListNode(l1.get(j));
                t1.next = t;
                t1 = t;
            }
        }
        if(t1!=null){
            t1.next = null;
        }
        return head1;
    }
}
