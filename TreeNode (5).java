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
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> a = new ArrayList<>();
        traversal(root, a);
        Collections.sort(a);
        int min = Math.abs(a.get(1)-a.get(0));
        for(int i=2;i<a.size();i++){
            int diff = Math.abs(a.get(i)-a.get(i-1));
            if(diff<min){
                min = diff;
            }
        }
        return min;
    }
}
public class MyClass {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}