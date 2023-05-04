class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int a = nums[i];
            if(h.containsKey(a)){
                h.put(a,h.get(a)+1);
            }
            else{
                h.put(a,1);
            }
        }
        int result = 0;
        for(int i: h.keySet()){
            if(h.get(i)==1){
                result = i;
                break;
            }
        }
        return result;
        
    }
}
