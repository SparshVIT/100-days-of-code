class Solution {
    public void traversal(TreeNode root, ArrayList<Integer> a){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            a.add(root.val);
            return;
        }
        traversal(root.left,a);
        traversal(root.right,a);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        traversal(root1,a);
        traversal(root2,b);
        if(a.size()!=b.size()){
            return false;
        }
        for(int i=0;i<a.size();i++){
            if(a.get(i)!=b.get(i)){
                return false;
            }
        }
        
        return true;
    }
}
