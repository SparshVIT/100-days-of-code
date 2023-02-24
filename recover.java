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
    ArrayList<Integer> a = new ArrayList<>();
    int i = 0;
    public void traversal(TreeNode root){
        if(root==null){
            return;
        }
        traversal(root.left);
        a.add(root.val);
        traversal(root.right);
    }
    public void makeBst(TreeNode root){
        if(root==null){
            return;
        }
        makeBst(root.left);
        root.val = a.get(i);
        i++;
        makeBst(root.right);
    }
    public void recoverTree(TreeNode root) {
        traversal(root);
        Collections.sort(a);
        makeBst(root);
        
    }
}
