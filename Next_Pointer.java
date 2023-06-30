class Solution {
    HashMap<Integer, List<Node>> h = new HashMap<>();
    public void c(Node root, int i){
        if(root==null){
            return;
        }
        if(h.containsKey(i)){
            h.get(i).add(root);
        }
        else{
            List<Node> l = new ArrayList<>();
            l.add(root);
            h.put(i,l);
        }
        i++;
        c(root.left,i);
        c(root.right,i);
    }
    public Node connect(Node root) {
        c(root,0);
        List<List<Node>> l = new ArrayList<>();
        for(int k: h.keySet()){
            l.add(h.get(k));
        }
        for(int i=0;i<l.size();i++){
            List<Node> a = l.get(i);
            for(int j=0;j<a.size()-1;j++){
                a.get(j).next = a.get(j+1);
            }
            a.get(a.size()-1).next = null;
        }
        return root;
    }
}
