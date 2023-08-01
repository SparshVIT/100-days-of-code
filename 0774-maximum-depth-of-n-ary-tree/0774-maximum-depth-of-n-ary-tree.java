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
    public int md(Node root){
        if(root==null){
            return 0;
        }
        Queue<Node> q = new LinkedList<>();
        q.addAll(root.children);
        int level = 1;
        while(q.isEmpty()!=true){
            List<Node> l = new ArrayList<>();
            for(Node v: q){
                l.addAll(v.children);
            }
            q = new LinkedList();
            q.addAll(l);
            level++;
        }
        return level;
    }
    public int maxDepth(Node root) {
        return md(root);
    }
}