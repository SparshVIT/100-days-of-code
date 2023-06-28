class Solution {
    public static int depth(Node root){
        if(root==null){
            return 0;
        }
        int l = depth(root.left);
        int r = depth(root.right);
        if(l>r){
            return l+1;
        }
        return r+1;
    }
  public static int maxDepth(Node root) {
    // code here
    return depth(root);
    

  }
}
  
