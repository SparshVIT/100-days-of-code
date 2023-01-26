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
    public void traversal(TreeNode root, SortedSet<Integer>a){
        if(root==null){
            return;
        }
        traversal(root.left,a);
        a.add(root.val);
        traversal(root.right,a);
    }
    public int findSecondMinimumValue(TreeNode root) {
        SortedSet<Integer> a = new TreeSet<>();
        traversal(root,a);
        int i = 0;
        int value = 0;
        if(a.size()==1){
            return -1;
        }
        for(int j: a){
            if(i==1){
                value = j;
            }
            i++;
        }
        return value;
    }
}
public class MyClass {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}