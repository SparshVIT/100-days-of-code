class Solution {
    public int binarysearch(int nums[], int low, int high, int target){
        if(high>=low){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                return binarysearch(nums, mid+1, high, target);
            }
            else if(nums[mid]>target){
                return binarysearch(nums, low, mid-1,target);
            }
        }
        return -1;
    }
    public int singleNumber(int[] nums) {
        int num =0;
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length-1;
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            int index1 = binarysearch(nums,low,i-1,n);
            int index2 = binarysearch(nums,i+1,high,n);
            if(index1==-1 && index2==-1){
                num = n;
                break;
            }
        }
        return num;
    }
}
public class single {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}