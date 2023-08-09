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
    List<String> l = new ArrayList<>();
    public void path(TreeNode root, String s){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            s += "->"+String.valueOf(root.val);
            l.add(s);
            return;
        }
        path(root.left,s+"->"+String.valueOf(root.val));
        path(root.right,s+"->"+String.valueOf(root.val));
    }
    public List<String> binaryTreePaths(TreeNode root) {
        String s = String.valueOf(root.val);
        if(root.left==null && root.right==null){
            l.add(s);
            return l;
        }
        path(root.left,s);
        path(root.right,s);
        return l;
    }
}