class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        TreeSet<Integer> t = new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            t.add(nums[i]);
        }
        ArrayList<Integer> a = new ArrayList<>();
        for(int i: t){
            a.add(i);
        }
        System.out.print(a);
        int length = 1;
        int max = 0;
        for(int i=1;i<a.size();i++){
            if(a.get(i)-a.get(i-1)==1){
                length++;
            }
            else{
                max = Math.max(length,max);
                length = 1;
            }
        }
        max = Math.max(length,max);
        return max;
    }
}
