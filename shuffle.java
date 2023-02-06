class Solution {
    public int[] shuffle(int[] nums, int n) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(nums[i]);
        }
        for(int i=n;i<nums.length;i++){
            b.add(nums[i]);
        }
        int j = 0;
        for(int i: a){
            nums[j] = i;
            j = j+2;
        }
        j = 1;
        for(int i: b){
            nums[j] = i;
            j = j+2;
        }
        return nums;
    }
}
