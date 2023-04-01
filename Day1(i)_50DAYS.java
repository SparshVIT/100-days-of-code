

//User function Template for Java



class Solution {
    int bs(int arr[], int low, int end, int x){
        if(low<=end){
            int mid = low + (end-low)/2;
            if(arr[mid]==x){
                return 1+bs(arr,mid+1,end,x)+bs(arr,low,mid-1,x);
            }
            else if(arr[mid]<x){
                return bs(arr,mid+1,end,x);
            }
            else if(arr[mid]>x){
                return bs(arr,low,mid-1,x);
            }
        }
        return 0;
    }
    int count(int[] arr, int n, int x) {
        // code here
        int c = bs(arr,0,arr.length-1,x);
        return c;
    }
}
