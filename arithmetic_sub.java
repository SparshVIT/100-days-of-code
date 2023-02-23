class Solution {
    public boolean isarithematic(List<Integer> l, int d){
        boolean check = true;
        
        for(int i=0;i<l.size()-1;i++){
            int diff = l.get(i+1)-l.get(i);
            if(diff!=d){
                return false;
            }
        }
        
        return check;
    }
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Integer> l1 = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            l1.add(nums[i]);
        }
        List<Boolean> res = new ArrayList<>();
        for(int i=0;i<l.length;i++){
            int low = l[i];
            int high = r[i];
            List<Integer> a = new ArrayList<>();
            for(int j=low;j<=high;j++){
                a.add(l1.get(j));
            }
            Collections.sort(a);
            int d = a.get(1)-a.get(0);
            boolean check = isarithematic(a,d);
            res.add(check);
        }
        return res;
    }
}
