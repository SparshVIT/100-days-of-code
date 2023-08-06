class Solution {
    int level = 0;
    int max = Integer.MIN_VALUE;
    public void max(TreeNode root){
        if(root==null){
            max = 0;
            level = 1;
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        level = 1;
        max = root.val;
        int lev = 1;
        if(root.left!=null){
            q.add(root.left);
        }
        if(root.right!=null){
            q.add(root.right);
        }
        while(q.isEmpty()!=true){
            lev++;
            int sum = 0;
            List<TreeNode> l = new ArrayList<>();
            for(TreeNode n: q){
                sum += n.val;
                if(n.left!=null){
                    l.add(n.left);
                }
                if(n.right!=null){
                    l.add(n.right);
                }
            }
            System.out.println(sum+" "+lev);
            if(sum>max){
                max = sum;
                level = lev;
            }
            q = new LinkedList<>();
            q.addAll(l);
        }


    }
    public int maxLevelSum(TreeNode root) {
        max(root);
        return level;
    }
}
