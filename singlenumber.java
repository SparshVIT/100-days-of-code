class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(h.containsKey(nums[i])){
                h.put(nums[i],h.get(nums[i])+1);
            }
            else{
                h.put(nums[i],1);
            }
        }
        int result=0;
        for(int i: h.keySet()){
            if(h.get(i)==1){
                result = i;
                break;
            }
        }
        return result;
    }
}
