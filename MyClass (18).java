class Solution {
    ArrayList<Integer> a = new ArrayList<>();
    public Solution(ListNode head) {
        ListNode temp = head;
        while(temp!=null){
            a.add(temp.val);
            temp = temp.next;
        }
    }
    
    public int getRandom() {
        int index = (int)(Math.random() * a.size());
        return a.get(index);
    }
}
public class MyClass {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}