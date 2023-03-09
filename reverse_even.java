class Solution {
    public ListNode reverseEvenLengthGroups(ListNode head) {
        List<Integer> l = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            l.add(temp.val);
            temp = temp.next;
        }
        int j = 1;
        int i = 0;
        List<Integer> l1 = new ArrayList<>();
        while(i<l.size()){
            if(i+j<l.size()){
                List<Integer> l2 = l.subList(i,i+j);
                if(l2.size()%2!=0){
                    l1.addAll(l2);
                }
                else{
                    Collections.reverse(l2);
                    l1.addAll(l2);
                }
                i = i+j;
            }
            else{
                List<Integer> l2 = l.subList(i,l.size());
                if(l2.size()%2!=0){
                    l1.addAll(l2);
                }
                else{
                    Collections.reverse(l2);
                    l1.addAll(l2);
                }
                i = l.size();
            }
            j++;
        }
        int m = 0;
        ListNode h1 = new ListNode(0);
        temp = null;
        for(int k=0;k<l1.size();k++){
            if(m==0){
                h1.val = l1.get(k);
                temp = h1;
                m++;
            }
            else{
                ListNode t = new ListNode(l1.get(k));
                temp.next = t;
                temp = t;
            }
        }
        if(temp!=null){
            temp.next = null;
        }
        return h1;
    }
}
