class Solution {
    public int pairSum(ListNode head) {
        ArrayList<Integer> a = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            a.add(temp.val);
            temp = temp.next;
        }
        int max = 0;
        int i  =0;
        int j = a.size()-1;
        while(i<j){
            int sum = a.get(i)+a.get(j);
            if(sum>max){
                max = sum;
            }
            i++;
            j--;
        }
        return max;
    }
}
