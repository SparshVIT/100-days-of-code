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
    PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
      public void ancdiff(TreeNode root, int value){
        if(root==null){
            return;
        }
        int diff = Math.abs(root.val-value);
        p.add(diff);
        ancdiff(root.left,value);
        ancdiff(root.right,value);
    }
    public void dfs(TreeNode root){
        if(root==null){
            return;
        }
        ancdiff(root,root.val);
        dfs(root.left);
        dfs(root.right);
    }
    public int maxAncestorDiff(TreeNode root) {
        if(root==null){
            return 0;
        }
        dfs(root);
        return p.poll();
    }
}