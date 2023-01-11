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
        ArrayList<ListNode> a = new ArrayList<>();
        ListNode temp = head;
        int length = 0;
        while(temp!=null){
            a.add(temp);
            temp = temp.next;
            length++;
        }
        if(length==0 || length==1){

        }
        else{
            int i = 0;
        int j = a.size()-1;
        while(i<j){
            if(i==0){
                head = a.get(0);
                temp = head;
            }
            else{
                temp.next = a.get(i);
                temp = a.get(i);
            }
            temp.next = a.get(j);
            temp = a.get(j);
            i++;
            j--;
        }
        if(i>j){
            if(temp!=null){
                temp.next = null;
            }
        }
        else if(i==j){
            temp.next = a.get(i);
            temp = a.get(i);
            if(temp!=null){
                temp.next = null;
            }
        }
        }
    }
}
public class Reorder_List {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}