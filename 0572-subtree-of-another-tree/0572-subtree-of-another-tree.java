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
    List<TreeNode> r = new ArrayList<>();
    List<Integer> l = new ArrayList<>();
    List<Integer> l1 = new ArrayList<>();
    boolean t = false;
    public void findroot(TreeNode root, TreeNode subRoot){
        if(root==null){
            return;
        }
        if(root.val==subRoot.val){
            r.add(root);
            //t = true;
            //return;
        }
        findroot(root.left,subRoot);
        findroot(root.right,subRoot);
    }
    public void inorder(TreeNode root, List<Integer> a){
        if(root==null){
            return;
        }
        inorder(root.left,a);
        a.add(root.val);
        inorder(root.right,a);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        findroot(root,subRoot);
        for(int i=0;i<r.size();i++){
            l = new ArrayList<>();
            l1 = new ArrayList<>();
            inorder(r.get(i),l);
        inorder(subRoot,l1);
        System.out.println(l);
        if(l.equals(l1)){
            return true;
        }
    }
    return false;
}
}