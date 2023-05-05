class Solution {
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        boolean result = false;
        targetSum = targetSum - root.val;
        if(targetSum==0 && root.left==null && root.right==null){
            return (result = true);
        }
        if(root.left!=null){
            result =  result || hasPathSum(root.left,targetSum);
        }
        if(root.right!=null){
            result = result || hasPathSum(root.right,targetSum);
        }
        return result;
    }
}
