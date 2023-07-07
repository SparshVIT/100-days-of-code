class Tree
{
    //Function to return list containing elements of left view of binary tree.
    HashMap<Integer,Integer> h = new HashMap<>();
    void traversal(Node root, int i, ArrayList<Integer> a){
        if(root==null){
            return;
        }
        if(h.containsKey(i)==false){
            h.put(i,1);
            a.add(root.data);
        }
        i = i+1;
        traversal(root.left,i,a);
        traversal(root.right,i,a);
    }
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> a = new ArrayList<>();
      traversal(root,0,a);
      return a;
      
    }
}
