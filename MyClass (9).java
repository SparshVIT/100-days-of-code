

/* The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}
*/

class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
         // Your code here
         HashMap<Integer, Integer> h = new HashMap<>();
         ArrayList<Integer> a = new ArrayList<>();
         Node temp = head;
         while(temp!=null){
             int d = temp.data;
             if(h.containsKey(d)==false){
                 h.put(d,1);
                 a.add(d);
             }
             temp = temp.next;
         }
         Node head1 = new Node(a.get(0));
         Node temp1 = head1;
         int i = 1;
         while(i<a.size()){
             Node t1 = new Node(a.get(i));
             temp1.next = t1;
             temp1 = t1;
             i++;
         }
         if(temp1!=null){
             temp1.next = null;
         }
         return head1;
    }
}
public class MyClass {
    public static void main(String args[]) {
      Solution s= new Solution();
    }
}