class Solution {
    public Stack<Integer> nodes(ArrayList<Integer> a, Stack<Integer> s, int index){
        if(index>=a.size()){
            return s;
        }
        if(s.isEmpty()){
            s.push(a.get(index));
        }
        else{
            while(s.peek()<a.get(index)){
                s.pop();
                if(s.size()==0){
                    break;
                }
            }
            s.push(a.get(index));
        }
        index = index+1;
        return nodes(a,s,index);
    }
    public ListNode removeNodes(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> a = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        while(temp!=null){
            a.add(temp.val);
            temp = temp.next;
        }
        int index = 0;
        s = nodes(a,s,index);
        ListNode h = new ListNode(0);
        ListNode temp1 = new ListNode(0);
        int m = 0;
        for(int i=0;i<s.size();i++){
            if(m==0){
                h.val = s.get(i);
                temp1 = h;
                m++;
            }
            else{
                ListNode t1 = new ListNode(s.get(i));
                temp1.next = t1;
                temp1 = t1;
            }
        }
        if(temp1!=null){
            temp1.next = null;
        }
        return h;
    }
}
