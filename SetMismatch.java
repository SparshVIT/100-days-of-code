class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        int res[] = new int[2];
        for(int i=0;i<nums.length;i++){
            if(h.containsKey(nums[i])){
                res[0] = nums[i];
            }
            else{
                h.put(nums[i],1);
            }
        }
        int i =1;
        while(h.containsKey(i)==true){
            i++;
        }
        res[1] = i;
        return res;
        
    }
}
