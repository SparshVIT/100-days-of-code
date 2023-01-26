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
    public TreeNode search(TreeNode root, int val){
        if(root==null || root.val==val){
            return root;
        }
        if(root.val<val){
            return search(root.right,val);
        }
        return search(root.left,val);
    }
    public TreeNode searchBST(TreeNode root, int val) {
        root = search(root,val);
        return root;
    }
}
public class MyClass {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}