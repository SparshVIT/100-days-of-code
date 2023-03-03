class Solution {
    public int minPairSum(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        Arrays.sort(nums);
        int i=0;
        int j = nums.length-1;
        while(i<j){
            List<Integer> l1 = new ArrayList<>();
            l1.add(nums[i]);
            l1.add(nums[j]);
            l.add(l1);
            i++;
            j--;
        }
        int sum = 0;
        for(int k=0;k<l.size();k++){
            int add = l.get(k).get(0)+l.get(k).get(1);
            if(add>sum){
                sum = add;
            }
        }
        return sum;
    }
}
