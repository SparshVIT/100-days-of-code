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
    public int numComponents(ListNode head, int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],1);
        }
        ListNode temp = head;
        int count = 0;
        ArrayList<String> s = new ArrayList<>();
        String st = "";
        while(temp!=null){
            int v = temp.val;
            if(h.containsKey(v)){
                st+=String.valueOf(v);
            }
            else{
                if(st.length()!=0){
                    s.add(st);
                }
                st = "";
            }
            temp = temp.next;
        }
        if(st.length()!=0){
            s.add(st);
        }
        return s.size();
    }
}
