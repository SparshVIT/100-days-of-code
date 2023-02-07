class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int arr[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[i];
        }
        HashMap<Integer,Integer>h = new HashMap<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int diff = i;
            if(h.containsKey(arr[i])==false){
                h.put(arr[i],diff);
            }
        }
        for(int i=0;i<nums.length;i++){
            int value = h.get(nums[i]);
            arr[i] = value;
        }
        return arr;
    }
}
