class BSTIterator {
    ArrayList<Integer> a = new ArrayList<>();
    Iterator<Integer> it;
    public void traversal(TreeNode root){
        if(root==null){
            return;
        }
        traversal(root.left);
        a.add(root.val);
        traversal(root.right);
    }
    public BSTIterator(TreeNode root) {
        traversal(root);
        it = a.iterator();
    }
    
    public int next() {
        return it.next();
    }
    
    public boolean hasNext() {
        return it.hasNext();
    }
}
