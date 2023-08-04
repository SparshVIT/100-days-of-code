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
    public boolean uni(TreeNode root, int d){
        if(root==null){
            return true;
        }
        if(root.val!=d){
            return false;
        }
        boolean t = uni(root.left,d);
        boolean r = uni(root.right,d);
        return t&r;

    }
    public boolean isUnivalTree(TreeNode root) {
        return uni(root,root.val); 
    }
}