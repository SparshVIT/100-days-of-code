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
    List<TreeNode> t = new ArrayList<>();
    public void tr(TreeNode r, List<Integer> l){
        if(r==null){
            l.add(Integer.MAX_VALUE);
            return;
        }
        l.add(r.val);
        tr(r.left,l);
        tr(r.right,l);
    }
    public void traversal(TreeNode root,HashMap<List<Integer>,Integer>h){
        if(root==null){
            return;
        }
        TreeNode r = root;
        List<Integer> l = new ArrayList<>();
        tr(r,l);
        if(h.containsKey(l)){
            if(h.get(l)!=0){
                t.add(root);
                h.put(l,h.get(l)-1);
            }
        }
        else{
            h.put(l,1);
        }
        traversal(root.left,h);
        traversal(root.right,h);
    }
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        HashMap<List<Integer>,Integer> h = new HashMap<>();
        traversal(root,h);
        return t;
    }
}
