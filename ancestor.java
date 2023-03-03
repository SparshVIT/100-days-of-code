/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public void subtree(TreeNode root, ArrayList<TreeNode> a){
        if(root==null){
            return;
        }
        a.add(root);
        subtree(root.left,a);
        subtree(root.right,a);
    }
    public void traversal(TreeNode root, TreeNode p, TreeNode q,ArrayList<TreeNode> nodes){
        if(root==null){
            return;
        }
        ArrayList<TreeNode> a = new ArrayList<>();
        subtree(root,a);
        if(a.contains(p) && a.contains(q)){
            nodes.add(root);
        }
        traversal(root.left,p,q,nodes);
        traversal(root.right,p,q,nodes);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> nodes = new ArrayList<>();
        traversal(root,p,q,nodes);
        TreeNode max = nodes.get(nodes.size()-1);
        return max;
    }
}
