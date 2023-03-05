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
    public void traversal(TreeNode root, ArrayList<Integer> a, int level){
        int l1 = level;
        int l2 = level;
        if(root==null || level>2){
            return;
        }
        if(level==2){
            a.add(root.val);
        }
        traversal(root.left,a,l1+1);
        traversal(root.right,a,l2+1);
    }
    public void traversal1(TreeNode root, ArrayList<Integer> a){
        if(root==null){
            return;
        }
        if(root.val%2==0){
            int level = 0;
            traversal(root,a,level);
        }
        traversal1(root.left,a);
        traversal1(root.right,a);
    }
    public int sumEvenGrandparent(TreeNode root) {
        ArrayList<Integer> a = new ArrayList<>();
        traversal1(root,a);
        int sum = 0;
        for(int i=0;i<a.size();i++){
            sum = sum+a.get(i);
        }
        return sum;
    }
}
