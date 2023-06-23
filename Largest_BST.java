class Solution{
    
    // Return the size of the largest sub-tree which is also a BST
    static int height(Node root){
        if(root==null){
            return 0;
        }
        return 1+height(root.left)+height(root.right);
    }
    static void traversal(Node root, PriorityQueue<Integer> p){
        if(root==null){
            return;
        }
        traversal(root.left, p);
        ArrayList<Integer> a = new ArrayList<>();
        Node r = root;
        isbst(r,a);
        boolean result = true;
        for(int i=1;i<a.size();i++){
            if(a.get(i)<=a.get(i-1)){
                result = false;
                break;
            }
        }
        if(result==true){
            r = root;
            int h = height(root);
            p.add(h);
        }
        traversal(root.right, p);
        
    }
    static void isbst(Node root, ArrayList<Integer> a){
        if(root==null){
            return;
        }
        isbst(root.left,a);
        a.add(root.data);
        isbst(root.right,a);
    }
    static int largestBst(Node root)
    {
        // Write your code here
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        if(root.left==null && root.right==null){
            return 1;
        }
        traversal(root, p);
        if(p.size()!=0){
            return p.peek();
        }
        return 1;
        
        
    }
    
}
