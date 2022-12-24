

//User function template for JAVA

/* Node is defined as

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/


class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code here
        HashMap<Node,Integer> h = new HashMap<>();
        Node n = head;
        boolean check = false;
        while(n!=null){
            if(n.next==null){
                return false;
            }
            if(h.containsKey(n)){
                check = true;
                break;
            }
            else{
                h.put(n,1);
            }
            n = n.next;
        }
        return check;
    }
}
public class MyClass {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}