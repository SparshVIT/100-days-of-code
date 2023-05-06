class Solution {
    List<List<Integer>> f = new ArrayList<>();
    public void path(TreeNode root, List<Integer> l){
        if(root==null){
            return;
        }
        l.add(root.val);
        if(root.left==null && root.right==null){
            f.add(l);
        }
        path(root.left, new ArrayList<>(l));
        path(root.right,new ArrayList<>(l));

    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> r = new ArrayList<>();
        List<List<Integer>> l = new ArrayList<>();
        path(root,r);
        for(List<Integer> t: f){
            int sum = 0;
            for(int g: t){
                sum += g;
            }
            if(sum==targetSum){
                l.add(t);
            }
        }
        return l;
    }
}
