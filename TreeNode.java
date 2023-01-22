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
    public void traversal(TreeNode root, PriorityQueue<Integer> p){
        if(root==null){
            return;
        }
        traversal(root.left,p);
        if(root!=null){
            p.add(root.val);
        }
        traversal(root.right,p);
    }
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        traversal(root, p);
        int element = 0;
        for(int i=0;i<k;i++){
            element = p.remove();
        }
        return element;
    }
}
public class MyClass {
    public static void main(String args[]) {
      Solution s =  new Solution();
    }
}