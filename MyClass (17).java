class Solution {
    public int binarySearch(int[] arr, int l, int h, int target){
        if(h>=l){
            int mid = l + (h-l)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                return binarySearch(arr, mid+1, h, target);
            }
            else{
                return binarySearch(arr,l,mid-1,target);
            }
        }
        return -1;
    }
    public int[] singleNumber(int[] nums) {
        int low = 0;
        Arrays.sort(nums);
        int high = nums.length-1;
        int arr[] = new int[2];
        int j = 0;
        for(int i=0;i<nums.length;i++){
            int i1 = binarySearch(nums,low,i-1,nums[i]);
            int i2 = binarySearch(nums,i+1,high,nums[i]);
            if(i1==-1 && i2==-1){
                arr[j] = nums[i];
                j++;
            }
        }
        return arr;
    }
}
 
public class MyClass {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}