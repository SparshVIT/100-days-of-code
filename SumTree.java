class Solution
{
    int sum(Node root){
        if(root==null){
            return 0;
        }
        return root.data+sum(root.left)+sum(root.right);
    }
    void traversal(Node root, ArrayList<Boolean> b){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            return;
        }
        Node e = root;
        int l = sum(e.left);
        int r = sum(e.right);
        if(root.data == (l+r)){
            b.add(true);
        }
        else{
            b.add(false);
        }
        traversal(root.left,b);
        traversal(root.right,b);
    }
	boolean isSumTree(Node root)
	{
	    ArrayList<Boolean> check = new ArrayList<>();
             // Your code here
             traversal(root,check);
             if(check.contains(false)){
                 return false;
             }
             return true;
	}
}
