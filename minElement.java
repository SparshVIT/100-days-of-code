class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int start=0;
        int end=n-1;
         int mid=start+(end-start)/2;
         int index = 0;
        while(start<=end){
           
            int next=(mid+1)%n;
            int prev=(mid+n-1)%n;
            if(nums[mid]<=nums[next]&&nums[mid]<=nums[prev]){
                index = mid;
                break;
            }
            if(nums[mid]<=nums[end]){
                end=mid-1;
            }
            else if(nums[start]<=nums[mid]){
                start=mid+1;
            }
           mid=start+(end-start)/2; 
        }
        return nums[mid];
    }
}
