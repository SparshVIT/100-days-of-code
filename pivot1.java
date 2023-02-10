class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer>shorter = new ArrayList<>();
        ArrayList<Integer> larger = new ArrayList<>();
        ArrayList<Integer> pivot1 = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int k = nums[i];
            if(k<pivot){
                shorter.add(k);
            }
            else if(k>pivot){
                larger.add(k);
            }
            else{
                pivot1.add(k);
            }
        }
        shorter.addAll(pivot1);
        shorter.addAll(larger);
        for(int i=0;i<shorter.size();i++){
            nums[i] = shorter.get(i);
        }
        return nums;
        
    }
}
