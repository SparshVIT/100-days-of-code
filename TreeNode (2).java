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
    int traversal(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+traversal(root.left)+traversal(root.right);
    }
    public int countNodes(TreeNode root) {
        int count  = traversal(root);
        return count;
    }
}
public class MyClass {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}