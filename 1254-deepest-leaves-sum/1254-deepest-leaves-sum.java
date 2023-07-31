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
    int level =0;
    public int deepestLeavesSum(TreeNode root) {
        if (root==null) return 0;
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        int output=root.val;
        while(!q.isEmpty()){
            List<TreeNode> levelNodes=new ArrayList();
            int temp=0;
            for(TreeNode node: q){
                if(node.left!=null){
                    levelNodes.add(node.left);
                }
                if(node.right!=null){
                    levelNodes.add(node.right);
                }
            }
            while(!q.isEmpty()){
                TreeNode t= q.poll();
                temp+=t.val;
            }
            q.addAll(levelNodes);
            output=temp;
        }
        return output;
    }

}