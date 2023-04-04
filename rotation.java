class Solution {
    int findKRotation(int arr[], int n) {
        // code here
        int start=0;
        int end=n-1;
         int mid=start+(end-start)/2;
        while(start<=end){
           
            int next=(mid+1)%n;
            int prev=(mid+n-1)%n;
            if(arr[mid]<=arr[next]&&arr[mid]<=arr[prev]){
                return mid;
            }
            if(arr[mid]<=arr[end]){
                end=mid-1;
            }
            else if(arr[start]<=arr[mid]){
                start=mid+1;
            }
           mid=start+(end-start)/2; 
        }
        return mid;

    }
}
