class Solution {
    int ans = 0;
    public int path_equal(TreeNode root){
        if(root==null){
            return 0;
        }
        int l = path_equal(root.left);
        int r = path_equal(root.right);
        int lm = 0;
        int rm = 0;
        if(root.left!=null && root.left.val==root.val){
            lm += l+1;
        }
        if(root.right!=null && root.right.val==root.val){
            rm += r+1;
        }
        ans = Math.max(ans,lm+rm);
        return Math.max(lm,rm);
    }
    public int longestUnivaluePath(TreeNode root) {
        path_equal(root);
        return ans;
    }
}
