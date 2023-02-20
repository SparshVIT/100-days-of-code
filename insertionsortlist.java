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
    public ListNode insertionSortList(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> a = new ArrayList<>();
        while(temp!=null){
            a.add(temp.val);
            temp = temp.next;
        }
        int j=0;
        for(int i=1; i<a.size();i++){
            int k = a.get(i);
            j = i-1;
            while(j>=0 && a.get(j)>k){
                a.set(j+1,a.get(j));
                j = j-1;
            }
            a.set(j+1,k);
        }
        ListNode h1 = new ListNode(0);
        ListNode temp1 = null;
        int m = 0;
        for(int i=0;i<a.size();i++){
            if(m==0){
                h1.val = a.get(i);
                temp1 = h1;
                m++;
            }
            else{
                ListNode t1 = new ListNode(a.get(i));
                temp1.next = t1;
                temp1 = t1;
            }
        }
        if(temp1!=null){
            temp1.next = null;
        }
        return h1;
    }
}
