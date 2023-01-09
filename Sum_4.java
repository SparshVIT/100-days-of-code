class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int x = j+1;
                int y = nums.length-1;
                while(x<y){
                    List<Integer> l = new ArrayList<>();
                    int sum = nums[i]+nums[j]+nums[x]+nums[y];
                    if(sum==-294967296){
                        break;
                    }
                    if(sum==target){
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[x]);
                        l.add(nums[y]);
                        set.add(l);
                        x++;
                    }
                    else if(sum<target){
                        x++;
                    }
                    else if(sum>target){
                        y--;
                    }
                }
            }
        }
        List<List<Integer>> lst = new ArrayList<>(set);
        return lst;
    }
}
public class Sum_4 {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}