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
    public  void traversal(TreeNode root, ArrayList<TreeNode> a){
        if(root==null){
            return;
        }
        a.add(root);
        traversal(root.left,a);
        traversal(root.right,a);
    }
    public void flatten(TreeNode root) {
        ArrayList<TreeNode> a = new ArrayList<>();
        traversal(root,a);
        TreeNode temp = root;
        int m=1;
        for(int i=0;i<a.size();i++){
            if(m==1){
                root = a.get(0);
                temp  = root;
                m +=1;
            }
            else{
                temp.right = a.get(i);
                temp.left = null;
                temp = a.get(i);
            }
        }
        if(temp!=null){
            temp.left = null;
            temp.right = null;
        }

    }
}
public class MyClass {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}