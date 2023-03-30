class Solution {
    HashMap<Integer,Integer> h = new HashMap<>();
    public int sum(TreeNode root){
        if(root==null){
            return 0;
        }
        return root.val+sum(root.left)+sum(root.right);
    }
    public void traversal_sum(TreeNode root){
        if(root==null){
            return;
        }
        int add = 0;
        add = sum(root);
        if(h.containsKey(add)){
            h.put(add,h.get(add)+1);
        }
        else{
            h.put(add,1);
        }
        traversal_sum(root.left);
        traversal_sum(root.right);

    }
    public int[] findFrequentTreeSum(TreeNode root) {
        traversal_sum(root);
        int max_f = Integer.MIN_VALUE;
        for(int k: h.keySet()){
            if(max_f<h.get(k)){
                max_f = h.get(k);
            }
        }
        ArrayList<Integer> a = new ArrayList<>();
        for(int k: h.keySet()){
            if(h.get(k)==max_f){
                a.add(k);
            }
        }
        int arr[] = new int[a.size()];
        for(int i=0;i<a.size();i++){
            arr[i] = a.get(i);
        }
        return arr;
    }
}
