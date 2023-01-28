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
    public void traversal(TreeNode root, HashMap<Integer, Integer> h){
        if(root==null){
            return;
        }
        traversal(root.left,h);
        if(h.containsKey(root.val)){
            h.put(root.val, h.get(root.val)+1);
        }
        else{
            h.put(root.val,1);
        }
        traversal(root.right,h);
    }
    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> h = new HashMap<>();
        traversal(root,h);
        int max = 0;
        for(int i: h.keySet()){
            if(h.get(i)>max){
                max = h.get(i);
            }
        }
        ArrayList<Integer> a = new ArrayList<>();
        for(int i: h.keySet()){
            if(h.get(i)==max){
                a.add(i);
            }
        }
        if(a.size()==0){
            int arr[] = new int[1];
            arr[0] = 0;
            return arr;
        }
        int arr[]  = new int[a.size()];
        for(int i=0;i<a.size();i++){
            arr[i] = a.get(i);
        }
        return arr;
    }
}
public class MyClass {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}