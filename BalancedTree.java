class Tree
{
    
    //Function to check whether a binary tree is balanced or not.
    ArrayList<Boolean> a = new ArrayList<>();
    int height(Node root){
       if(root==null){
           return 0;
       }
       int lh = height(root.left);
       int rh = height(root.right);
       if(lh>rh){
           return lh+1;
       }
       return rh+1;
    }
    void traversal(Node root){
        if(root==null){
            return;
        }
        traversal(root.left);
        Node l = root.left;
        Node r = root.right;
        int lh = height(l);
        int rh = height(r);
        if(Math.abs(rh-lh)<=1){
            a.add(true);
        }
        else{
            a.add(false);
        }
        traversal(root.right);
    }
    boolean isBalanced(Node root)
    {
	// Your code here
	traversal(root);
	if(a.contains(false)){
	    return false;
	}
	return true;
	
    }
}
