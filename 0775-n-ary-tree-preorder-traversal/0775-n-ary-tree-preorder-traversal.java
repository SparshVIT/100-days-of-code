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
    List<Integer> l = new ArrayList<>();
    public void d(Node root){
        if(root==null){
            return;
        }
        l.add(root.val);
        for(Node r: root.children){
            d(r);
        }
        return;
    }
    public List<Integer> preorder(Node root) {
        d(root);
        return l;
    }
}