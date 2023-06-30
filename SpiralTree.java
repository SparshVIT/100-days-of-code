class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.
    Map<Integer, Deque<Integer>> h = new LinkedHashMap<>();
    public void traversal(Node root, int i){
        if(root==null){
            return;
        }
        if(h.containsKey(i)){
            if(i%2==0){
                h.get(i).addFirst(root.data);
            }
            else{
                h.get(i).addLast(root.data);
            }
        }
        else{
            Deque<Integer> d = new ArrayDeque<>();
            d.addLast(root.data);
            h.put(i,d);
        }
        i++;
        traversal(root.left,i);
        traversal(root.right,i);
    }
    public ArrayList<Integer> findSpiral(Node root) 
    {
        // Your code here
        traversal(root,0);
        ArrayList<Integer> a = new ArrayList<>();
        for(Map.Entry<Integer, Deque<Integer>>
                 entry : h.entrySet()){
            ArrayList<Integer> l = new ArrayList<>(entry.getValue());
            a.addAll(l);
        }
        return a;
    }
}
