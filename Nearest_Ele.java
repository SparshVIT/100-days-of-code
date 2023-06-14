class Solution
{
    //Function to find the least absolute difference between any node
    //value of the BST and the given integer.
    static void cal_min(Node root,ArrayList<Integer> a){
        if(root==null){
            return;
        }
        cal_min(root.left,a);
        a.add(root.data);
        cal_min(root.right,a);
    }
    static int minDiff(Node  root, int K) 
    { 
        // Write your code here
        ArrayList<Integer> a = new ArrayList<>();
        cal_min(root,a);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<a.size();i++){
            min = Math.min(Math.abs(a.get(i)-K),min);
        }
        return min;
    } 
}
