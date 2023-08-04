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
    public int d(TreeNode root){
        if(root==null){
            return 0;
        }
        int l = 1+d(root.left);
        int r = 1+d(root.right);
        return Math.max(l,r);
    }
    public void traverse(TreeNode root){
        if(root==null){
            return;
        }
        traverse(root.left);
     traverse(root.right);
         int l = d(root.left);
     int r = d(root.right);
     p.add(l+r);
    }
    public int diameterOfBinaryTree(TreeNode root) {
     if(root==null){
         return 1;
     }
    traverse(root);
    return p.poll();
     
     
    }
}