class Solution {
    int dp[] = new int[0];
    public int find(int arr[], int d){
        if(d<0){
            return 0;
        }
        int index = d-1;
        int sum = arr[d];
        if(dp[d]!=-1){
            return dp[d];
        }
        while(index>=0 && arr[index]==arr[d]){
            sum += arr[index];
            index--;
        }
        while(index>=0 && arr[index]==arr[d]-1){
            index--;
        }
        int a = sum+find(arr,index);
        int b = find(arr,d-1);
        //System.out.println(a);
        //System.out.println(b);
        return dp[d] =  Math.max(a,b);
    }
    public int deleteAndEarn(int[] nums) {
        dp = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            dp[i] = -1;
        }
        Arrays.sort(nums);
        return find(nums,nums.length-1);
    }
}