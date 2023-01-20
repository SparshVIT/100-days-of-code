class Solution {
    public int binarySearch(int nums[], int l ,int h, int target){
        if(l<=h){
            int mid = l + (h-l)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                return binarySearch(nums,mid+1,h,target);
            }
            else if(nums[mid]>target){
                return binarySearch(nums, l, mid-1, target);
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low<high){
            int mid = (low+high)/2;
            if(nums[mid]>nums[high]){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        int min_index = low;
        if(target==nums[min_index]){
            return min_index;
        }
        int index1 = 0;
        index1 = binarySearch(nums, 0, min_index-1, target);
        if(index1==-1){
            index1 = binarySearch(nums, min_index+1, nums.length-1, target);
        }
        return index1;
    }
}
public class search_ele {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}