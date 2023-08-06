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
    List<Integer> l = new ArrayList<>();
    public void inor(TreeNode root){
        if(root==null){
            return;
        }
        inor(root.left);
        l.add(root.val);
        inor(root.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        inor(root);
        return l;
    }
}