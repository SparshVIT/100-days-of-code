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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode totree(ArrayList<Integer> a, int l, int h){
        if(l>h){
            return null;
        }
        int mid = l+(h-l)/2;
        TreeNode n = new TreeNode(a.get(mid));
        n.left = totree(a,l,mid-1);
        n.right = totree(a,mid+1,h);
        return n;
    }
    public TreeNode sortedListToBST(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> a = new ArrayList<>();
        while(temp!=null){
            a.add(temp.val);
            temp = temp.next;
        }
        TreeNode root = totree(a,0,a.size()-1);
        return root;
    }
}
