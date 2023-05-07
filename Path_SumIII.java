class Solution {
    List<TreeNode> t = new ArrayList<>();
    int a = 0;
    public void put_lst(TreeNode root){
        if(root==null){
            return;
        }
        t.add(root);
        put_lst(root.left);
        put_lst(root.right);
    }
    public void sum(TreeNode root, long sum, int ts){
        if(root==null){
            return;
        }
        sum = sum+root.val;
        if(sum==ts){
            a++;
        }
        sum(root.left,sum,ts);
        sum(root.right,sum,ts);
    }
    public int pathSum(TreeNode root, int targetSum) {
        put_lst(root);
        for(int i=0;i<t.size();i++){
            long sum = 0;
            sum(t.get(i),sum,targetSum);
        }
        return a;
    }
}
