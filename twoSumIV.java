class Solution {
    ArrayList<Integer> a = new ArrayList<>();
    public void add(TreeNode root){
        if(root==null){
            return;
        }
        add(root.left);
        a.add(root.val);
        add(root.right);
    }
    public boolean findTarget(TreeNode root, int k) {
        add(root);
        int x = 0;
        int y = a.size()-1;
        boolean check = false;
        while(x<y){
            int sum = a.get(x)+a.get(y);
            if(sum>k){
                y--;
            }
            else if(sum<k){
                x++;
            }
            else if(sum==k){
                check = true;
                break;
            }
        }
        return check;
    }
}
