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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> a = new ArrayList<>();
        while(temp!=null){
            a.add(temp.val);
            temp = temp.next;
        }
        ArrayList<Integer> c = new ArrayList<>();
        if(a.size()<=2){
            int arr[] = new int[2];
            arr[0]=-1;
            arr[1]=-1;
            return arr;
        }
        for(int i=1;i<a.size()-1;i++){
            boolean d = a.get(i)>a.get(i-1) && a.get(i)>a.get(i+1);
            boolean e = a.get(i)<a.get(i-1) && a.get(i)<a.get(i+1);
            if(d||e){
                c.add(i);
            }
        }
        Collections.sort(c);
        if(c.size()<=1){
            int arr[] = new int[2];
            arr[0]=-1;
            arr[1]=-1;
            return arr;
        }
        int max = c.get(c.size()-1)-c.get(0);
        int min = Integer.MAX_VALUE;
        for(int i=1;i<c.size();i++){
            int diff = c.get(i)-c.get(i-1);
            if(diff<min){
                min = diff;
            }
        }
        int arr[] = new int[2];
        arr[0] = min;
        arr[1] = max;
        return arr;
    }
}
