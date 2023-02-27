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
    public int max_ind(List<Integer> n){
        int max = Integer.MIN_VALUE;
        int max_ind = -1;
        for(int i=0;i<n.size();i++){
            if(max<n.get(i)){
                max = n.get(i);
                max_ind = i;
            }
        }
        return max_ind;
    }
    public TreeNode make_bst(List<Integer> n){
        int index = max_ind(n);
        if(index<0){
            return null;
        }
        TreeNode root = new TreeNode(n.get(index));
        if(index!=0){
            root.left = make_bst(n.subList(0,index));
        }
        if(index!=n.size()-1){
            root.right = make_bst(n.subList(index+1,n.size()));
        }
        return root;
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            a.add(nums[i]);
        }
        TreeNode root = make_bst(a);
        return root;
    }
}
