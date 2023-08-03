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
    int sum = 0;
    public int sum(TreeNode root){
        if(root==null){
            return  0;
        }
        return root.val + sum(root.left)+sum(root.right);
    }
    public void dfs(TreeNode root){
        if(root==null){
            return;
        }
        TreeNode r = root;
        sum += Math.abs(sum(r.left)-sum(r.right));
        dfs(root.left);
        dfs(root.right);
    }
    public int findTilt(TreeNode root) {
        dfs(root);
        return sum;
    }
}