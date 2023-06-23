class Solution {
    public void check(TreeNode root, Stack<Integer> s, ArrayList<Integer> a, int max){
        if(root==null){
            return;
        }
        s.push(root.val);
        if(root.val>=max){
            a.add(root.val);
            max = root.val;
        }
        check(root.left,s,a,max);
        check(root.right,s,a,max);
        s.pop();

    }
    public int goodNodes(TreeNode root) {
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> a = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        check(root,s,a,max);
        return a.size();
    }
}
