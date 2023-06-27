class Solution {
    TreeMap<Integer, List<Integer>> t = new TreeMap<>();
    public void LOT(TreeNode root, int i){
        if(root==null){
            return;
        }
        if(t.containsKey(i)){
            t.get(i).add(root.val);
        }
        else{
            List<Integer> l = new ArrayList<>();
            l.add(root.val);
            t.put(i,l);
        }
        i++;
        LOT(root.left,i);
        LOT(root.right,i);

    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> l = new ArrayList<>();
        LOT(root,0);
        for(Map.Entry<Integer, List<Integer>>
                 entry : t.entrySet()){
            l.add(entry.getValue());
        }
        return l;
    }
}
