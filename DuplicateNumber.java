class Solution {
    int binarysearch(int nums[], int l, int h, int k){
        if(h>=l){
            int mid = l + (h-l)/2;
            if(nums[mid]==k){
                return mid;
            }
            else if(nums[mid]<k){
                l = mid+1;
                return binarysearch(nums,l,h,k);
            }
            else if(nums[mid]>k){
                h = mid-1;
                return binarysearch(nums,l,h,k);
            }
        }
        return -1;
    }
    public int findDuplicate(int[] nums) {
        int dno = 0;
        int l = 0;
        int h = nums.length-1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int index1 = binarysearch(nums,l,i-1,nums[i]);
            int index2 = binarysearch(nums,i+1,h,nums[i]);
            if(index1!=-1 || index2!=-1){
                dno = nums[i];
                break;
            }
        }
        return dno;
    }
}
public class DuplicateNumber {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}