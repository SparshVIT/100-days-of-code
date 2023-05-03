class Solution {
    public TreeNode toTree(int[] nums, int l, int r){
        if(l>r){
            return null;
        }
        int mid = l+(r-l)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = toTree(nums,l,mid-1);
        root.right = toTree(nums,mid+1,r);
        return root;

    }
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = toTree(nums,0,nums.length-1);
        return root;
    }
}
