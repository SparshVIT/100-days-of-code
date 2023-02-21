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
    public void traversal(TreeNode r1, List<Integer> l){
        if(r1==null){
            return;
        }
        traversal(r1.left,l);
        l.add(r1.val);
        traversal(r1.right,l);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> l = new ArrayList<>();
        traversal(root1,l);
        traversal(root2,l);
        Collections.sort(l);
        return l;
    }
}
