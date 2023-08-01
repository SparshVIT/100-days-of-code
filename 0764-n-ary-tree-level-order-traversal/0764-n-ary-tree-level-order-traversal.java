/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<List<Node>> l = new ArrayList<>();
    public void lot(Node root){
        Queue<Node> q = new LinkedList<>();
        q.addAll(root.children);
        List<Node> l1 = new ArrayList<>();
        l1.add(root);
        l.add(l1);
        while(q.isEmpty()!=true){
            l1 = new ArrayList<>();
            List<Node> l2 = new ArrayList<>();
            for(Node v: q){
                l1.add(v);
                l2.addAll(v.children);
            }
            q = new LinkedList<>();
            q.addAll(l2);
            l.add(l1);
        }
    }
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> l3 = new ArrayList<>();
        if(root==null){
            return l3;
        }
        lot(root);
        for(int i=0;i<l.size();i++){
            l3.add(new ArrayList<>());
        }
        for(int i=0;i<l.size();i++){
            for(int j=0;j<l.get(i).size();j++){
                l3.get(i).add(l.get(i).get(j).val);
            }
        }
        return l3;
    }
}