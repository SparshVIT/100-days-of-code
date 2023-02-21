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
    public int sum(TreeNode r1){
        if(r1==null){
            return 0;
        }
        return r1.val+sum(r1.left)+sum(r1.right);
    }
    public int count(TreeNode r1){
        if(r1==null){
            return 0;
        }
        return 1+count(r1.left)+count(r1.right);
    }
    public void average(TreeNode r, List<Boolean> l){
        if(r==null){
            return;
        }
        average(r.left, l);
        int a = sum(r)/count(r);
        if(a==r.val){
            l.add(true);
        }
        else{
            l.add(false);
        }
        average(r.right,l);
    }
    public int averageOfSubtree(TreeNode root) {
        List<Boolean> l = new ArrayList<>();
        average(root,l);
        int count = 0;
        for(boolean i: l){
            if(i){
                count++;
            }
        }
        return count;
    }
}
