class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        HashMap<Integer, HashSet<Integer>> h = new HashMap<>();
        for(int i=0;i<logs.length;i++){
            int user = logs[i][0];
            if(h.containsKey(user)){
                h.get(user).add(logs[i][1]);
            }
            else{
                HashSet<Integer> h1 = new HashSet<>();
                h1.add(logs[i][1]);
                h.put(user,h1);
            }
        }
        int arr[] = new int[k];
        for(int i=0;i<k;i++){
            arr[i] = 0;
        }
        for(Map.Entry<Integer, HashSet<Integer>> e: h.entrySet()){
            int size = e.getValue().size();
            arr[size-1]+=1;
        }
        return arr;
    }
}
