class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> a = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            a.add(temp.val);
            temp = temp.next;
        }
        int x = 0;
        int arr[] = new int[a.size()];
        for(int i=0;i<a.size();i++){
            int larger_number = 0;
            int j = i+1;
            while(j<a.size() && a.get(j)<=a.get(i)){
                j++;
            }
            if(j<a.size()){
                if(a.get(j)==a.get(i)){
                    arr[x] = 0;
                }
                else{
                    arr[x] = a.get(j);
                }
                x++;
            }
            else{
                arr[x] = 0;
                x++;
            }
        }
        return arr;
    }
}
