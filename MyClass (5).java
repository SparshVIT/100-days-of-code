class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> s = new Stack<>();
        ListNode temp = head;
        while(temp!=null){
            s.push(temp.val);
            temp = temp.next;
        }
        
        temp = head;
        while(temp!=null){
            if(temp.val!=s.peek()){
                break;
            }
            else{
                s.pop();
            }
            temp=temp.next;
        }
        if(s.size()==0){
            return true;
        }
        return false;
    }
}
public class MyClass {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}