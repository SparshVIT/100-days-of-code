class Solution {
    TreeMap<Integer,List<Node>> t = new TreeMap<>();
    public void traversal(Node root, int i){
        if(root==null){
            return;
        }
        if(t.containsKey(i)){
            t.get(i).add(root);
        }
        else{
            List<Node> r = new ArrayList<>();
            r.add(root);
            t.put(i,r);
        }
        i++;
        traversal(root.left,i);
        traversal(root.right,i);
    }
    public Node connect(Node root) {
        traversal(root,0);
        List<List<Node>> l = new ArrayList<>();
        for (Map.Entry<Integer, List<Node>> entry : t.entrySet()){
            l.add(entry.getValue());
        }
        for(int i=0;i<l.size();i++){
            List<Node> l1 = l.get(i);
            for(int j=0;j<l1.size()-1;j++){
                l1.get(j).next = l1.get(j+1);
            }
            l1.get(l1.size()-1).next = null;
        }
        return root;
    }
}
