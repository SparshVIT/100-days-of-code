class Solution {
    public int binarySearch(int nums[], int low, int high, int target){
        if(high>low){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                return binarySearch(nums,low,mid-1,target);
            }
            else if(target>nums[mid]){
                return binarySearch(nums,mid+1,high,target);
            }
        }
        if(nums[low]<target){
            return low+1;
        }
        return low;
    }
    public int searchInsert(int[] nums, int target) {
        if(target<nums[0]){
            return 0;
        }
        else if(target>nums[nums.length-1]){
            return nums.length;
        }
        if(nums.length==1 && nums[0]==target){
            return 0;
        }
        int low = 0;
        int high = nums.length-1;
        int t = binarySearch(nums,low,high,target);
        return t;
    }
}
