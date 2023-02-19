class Solution {
    public ListNode mergeNodes(ListNode head) {
        ArrayList<Integer> a = new ArrayList<>();
        ListNode temp = head.next;
        int sum = 0;
        while(temp!=null){
            if(temp.val==0){
                a.add(sum);
                sum = 0;
            }
            else{
                sum = sum+temp.val;
            }
            temp = temp.next;
        }
        ListNode h1 = new ListNode(0);
        ListNode temp1 = null;
        int m = 0;
        for(int i=0;i<a.size();i++){
            if(m==0){
                h1.val = a.get(i);
                temp1 = h1;
                m++;
            }
            else{
                ListNode t1 = new ListNode(a.get(i));
                temp1.next = t1;
                temp1 = t1;
            }
        }
        if(temp1!=null){
            temp1.next = null;
        }
        return h1;
    }
}
