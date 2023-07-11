class Solution {
    public int minimumOperations(int[] nums) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                p.add(nums[i]);
            }
        }
        int ops = 0;
        while(p.size()!=0){
            ArrayList<Integer> a = new ArrayList<>();
            int min = p.peek();
            while(p.size()!=0){
                int d = p.poll();
                if(d!=0){
                    a.add(d-min);
                }
            }
            for(int i=0;i<a.size();i++){
                if(a.get(i)!=0){
                    p.add(a.get(i));
                }
            }
            ops++;
        }
        return ops;
    }
}
