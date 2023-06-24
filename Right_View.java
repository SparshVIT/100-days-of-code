class Solution {
    HashMap<Integer,Integer> h = new HashMap<>(); 
    public void traversal(TreeNode root, List<Integer> l, int level){
        if(root==null){
            return;
        }
        if(h.containsKey(level)==false){
                l.add(root.val);
                h.put(level,root.val);
        }
        level++;
        traversal(root.right,l,level);
        traversal(root.left,l,level);

    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        if(root==null){
            return l;
        }
        traversal(root,l,0);
        return l;
    }
}
