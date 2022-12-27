class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        HashMap<Node, Integer> h = new HashMap<>();
        Node n = head;
        while(n!=null){
            Node a = n.next;
            if(h.containsKey(a)){
                n.next = null;
            }
            else{
                h.put(n,1);
            }
            n = n.next;
        }
    }
}
public class MyClass {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}