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
    public void bfs(TreeNode root, List<List<TreeNode>> l){
        if(root==null){
            return;
        }
        List<TreeNode> l1 = new ArrayList<>();
        l1.add(root);
        l.add(l1);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.isEmpty()!=true){
            l1 = new ArrayList<>();
            for(TreeNode n: q){
               if(n.left!=null){
                   l1.add(n.left);
               }
               if(n.right!=null){
                   l1.add(n.right);
               }
            }
            q = new LinkedList<>();
            q.addAll(l1);
            if(l1.size()!=0){
                l.add(l1);
            }
        }
    }
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        List<List<TreeNode>> l = new ArrayList<>();
        bfs(root,l);
        TreeNode lca = null;
        List<TreeNode> l1 = l.get(l.size()-1);
        //System.out.println(l)
        
        for(int i=0;i<=l.size()-1;i++){
            for(int j=0;j<l.get(i).size();j++){
                List<List<TreeNode>> l2 = new ArrayList<>();
                bfs(l.get(i).get(j),l2);
                if(l2.get(l2.size()-1).equals(l1)){
                    lca = l.get(i).get(j);
                }
                
            }
        }
        return lca;
    }
    
}