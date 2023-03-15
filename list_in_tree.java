class Solution {
    boolean check1 = false;
    public void traversal(TreeNode root, String str, String check){
        if(root==null){
            return;
        }
        str = str+String.valueOf(root.val);
        if(str.indexOf(check)>=0){
            check1 = true;
            return;
        }
        traversal(root.left,str,check);
        traversal(root.right,str,check);
    }
    public boolean isSubPath(ListNode head, TreeNode root) {
        String str1 = "";
        ListNode temp = head;
        while(temp!=null){
            str1 = str1+String.valueOf(temp.val);
            temp = temp.next;
        }
        String str = "";
        traversal(root,str,str1);
        return check1;
    }
}
