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
    public void traversal(TreeNode root, ArrayList<Integer> a){
        if(root==null){
            return;
        }
        traversal(root.left,a);
        a.add(root.val);
        traversal(root.right,a);
    }
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> a = new ArrayList<>();
        boolean isvalid = true;
        traversal(root,a);
        for(int i=1;i<a.size();i++){
            if(a.get(i)<=a.get(i-1)){
                isvalid = false;
                break;
            }
        }
        return isvalid;
    }
}
public class check_for_bst {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}