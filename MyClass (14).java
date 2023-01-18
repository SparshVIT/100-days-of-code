class Solution {
    public int binarysearch(int arr[], int low, int high, int target){
        if(high>=low){
            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                return binarysearch(arr,mid+1,high,target);
            }
            else if(arr[mid]>target){
                return binarysearch(arr,low,mid-1,target);
            }
        }
        return -1;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean ispresent = false;
        for(int i=0;i<matrix.length;i++){
            int l = 0;
            int high = matrix[i].length-1;
            int j = binarysearch(matrix[i],l,high,target);
            if(j!=-1){
                ispresent = true;
                break;
            }
        }
        return ispresent;
    }
}
public class MyClass {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}