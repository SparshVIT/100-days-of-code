class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                a.add(nums[i]);
            }
            else{
                b.add(nums[i]);
            }
        }
        int j = 0;
        int x = 0;
        int y = 0;
        while(j!=nums.length){
            if(j%2==0){
                nums[j] = b.get(y);
                y++;
            }
            else{
                nums[j] = a.get(x);
                x++;
            }
            j++;
        }
        
        return nums;
    }
}
