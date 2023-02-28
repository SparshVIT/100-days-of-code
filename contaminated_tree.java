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
class FindElements {
    TreeNode r;
    ArrayList<Integer> a  = new ArrayList<>();
    public FindElements(TreeNode root) {
        r = root;
        r.val = 0;
        modify(r);
        traversal(r);
    }
    
    public boolean find(int target) {
        return a.contains(target);
    }
    public void modify(TreeNode r){
        if(r.left!=null){
            r.left.val = 2*r.val+1;
            modify(r.left);
        }
        if(r.right!=null){
            r.right.val = 2*r.val+2;
            modify(r.right);
        }
    }
    public void traversal(TreeNode r){
        if(r==null){
            return;
        }
        traversal(r.left);
        a.add(r.val);
        traversal(r.right);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */
