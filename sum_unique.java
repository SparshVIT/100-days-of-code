class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(h.containsKey(nums[i])){
                h.put(nums[i],h.get(nums[i])+1);
            }
            else{
                h.put(nums[i],1);
            }
        }
        int sum = 0;
        for(int x: h.keySet()){
            if(h.get(x)==1){
                sum = sum+x;
            }
        }
        return sum;
    }
}
