class Solution {
    ArrayList<String> a = new ArrayList<>();
    public void traversal(TreeNode root, String str){
        if(root==null){
            return;
        }
        str+=String.valueOf(root.val);
        if(root.left==null && root.right==null){
            a.add(str);
            return;
        }
        traversal(root.left,str);
        traversal(root.right,str);
    }
    public int sumNumbers(TreeNode root) {
        int sum = 0;
        String s = "";
        traversal(root,s);
        for(int i=0;i<a.size();i++){
            sum+=Integer.parseInt(a.get(i));
        }
        return sum;
        
    }
}
