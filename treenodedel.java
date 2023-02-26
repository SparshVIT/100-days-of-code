/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void traversal(TreeNode root, ArrayList<Integer> a){
        if(root==null){
            return;
        }
        traversal(root.left,a);
        a.add(root.val);
        traversal(root.right,a);
    }
    public int binarySearch(ArrayList<Integer> a, int l, int h, int target){
        if(h>=l){
            int mid = l+(h-l)/2;
            if(a.get(mid)==target){
                return mid;
            }
            else if(a.get(mid)<target){
                return binarySearch(a,mid+1,h,target);
            }
            else if(a.get(mid)>target){
                return binarySearch(a,l,mid-1,target);
            }
        }
        return -1;
    }
    public TreeNode makeBst(ArrayList<Integer> a ,int low, int high){
        if(low>high){
            return null;
        }
        int mid = low+(high-low)/2;
        TreeNode root = new TreeNode(a.get(mid));
        root.left = makeBst(a,low,mid-1);
        root.right = makeBst(a,mid+1,high);
        return root;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }
        ArrayList<Integer> a = new ArrayList<>();
        traversal(root,a);
        int ind = binarySearch(a,0,a.size()-1,key);
        if(ind!=-1){
            a.remove(ind);
            TreeNode r = makeBst(a,0,a.size()-1);
            return r;
        }
        return root;
    }
}
