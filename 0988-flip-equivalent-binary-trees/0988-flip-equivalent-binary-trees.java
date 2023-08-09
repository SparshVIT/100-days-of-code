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
    HashMap<Integer,List<Integer>> h = new HashMap<>();
    HashMap<Integer,List<Integer>> h1 = new HashMap<>();
    public void traverse(TreeNode root, HashMap<Integer,List<Integer>> a){
        if(root==null){
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.isEmpty()!=true){
            List<TreeNode> l = new ArrayList<>();
            for(TreeNode v: q){
                List<Integer> l1 = new ArrayList<>();
                if(v.left!=null){
                    l.add(v.left);
                    l1.add(v.left.val);
                }
                if(v.right!=null){
                    l.add(v.right);
                    l1.add(v.right.val);
                }
                Collections.sort(l1);
                if(a.containsKey(v.val)){
                    a.get(v.val).addAll(l1);
                }
                else{
                    a.put(v.val,l1);
                }

            }
            q = new LinkedList<>();
            q.addAll(l);
        }
    }
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        traverse(root1,h);
        traverse(root2,h1);
        
        for(int i: h.keySet()){
            if(h1.containsKey(i)==false){
                return false;
            }
            else{
                if(h1.get(i).equals(h.get(i))==false){
                    return false;
                }
            }
        }
        for(int i: h1.keySet()){
            if(h.containsKey(i)==false){
                return false;
            }
            else{
                if(h1.get(i).equals(h.get(i))==false){
                    return false;
                }
            }
        }
        return true;
    }
}