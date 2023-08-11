class Solution {
    List<TreeNode> l = new ArrayList<>();
    public TreeNode find(TreeNode root,List<Integer> l1){
        if(root==null){
            return null;
        }
        root.left = find(root.left,l1);
        root.right= find(root.right,l1);
        if(l1.contains(root.val)){
            if(root.left!=null){
                l.add(root.left);
            }
            if(root.right!=null){
                l.add(root.right);
            }
            return null;
        }
        return root;
    }
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<Integer> l1 = new ArrayList<>();
        for(int i=0;i<to_delete.length;i++){
            l1.add(to_delete[i]);
        }
        if(l1.contains(root.val)==false){
            l.add(root);
        }
        find(root,l1);
        return l;
        
    }
}
