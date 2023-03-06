class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            if(h.containsKey(num)){
                h.put(num,h.get(num)+1);
            }
            else{
                h.put(num,1);
            }
        }
        int j=0;
        int missing = 0;
        int count = 1;
        while(j<k){
            if(h.containsKey(count)==false){
                missing = count;
                j++;
            }
            count++;
        }
        return missing;
    }
}
