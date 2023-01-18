class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<Integer> l = new ArrayList<>();
        int present = nums[0];
        int freq = 0;
        int cons = n/3;
        for(int i =0;i<n;i++){
            if(nums[i]!=present){
                if(freq>cons){
                    l.add(present);
                }
                freq = 0;
                freq+=1;
                present = nums[i];
            }
            else{
                freq++;
            }
        }
        if(freq>cons){
            l.add(present);
        }
        return l;
    }
}
public class MyClass {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}