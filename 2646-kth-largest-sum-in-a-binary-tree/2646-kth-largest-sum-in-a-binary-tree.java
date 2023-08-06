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
    ArrayList<Long> l = new ArrayList<>();
    public void sum(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        l.add((long)root.val);
        if(root.left!=null){
            q.add(root.left);
        }
        if(root.right!=null){
            q.add(root.right);
        }
        while(q.isEmpty()!=true){
            List<TreeNode> n = new ArrayList<>();
            long sum = 0;
            for(TreeNode v: q){
                sum += v.val;
            }
            l.add(sum);
            for(TreeNode v: q){
                if(v.left!=null){
                    n.add(v.left);
                }
                if(v.right!=null){
                    n.add(v.right);
                }
            }
            q = new LinkedList<>();
            q.addAll(n);
        }
    }
    public long kthLargestLevelSum(TreeNode root, int k) {
        sum(root);
        Collections.sort(l);
        if(k>l.size()){
            return -1;
        }
        return l.get(l.size()-k);
    }
}