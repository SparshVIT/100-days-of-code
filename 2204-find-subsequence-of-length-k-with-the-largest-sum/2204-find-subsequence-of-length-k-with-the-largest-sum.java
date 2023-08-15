class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] result = new int[k];;
        int[] index = IntStream.range(0, nums.length).boxed().sorted((o1, o2) -> nums[o2] - nums[o1])
                .mapToInt(Integer::intValue).toArray();

        Arrays.sort(index, 0, k);

        for (int i = 0; i < k; i++)
            result[i] = nums[index[i]];

        return result;
    }
}