class Solution
{
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
       // add your code here
       Arrays.sort(arr2);
       ArrayList<Integer> a = new ArrayList<>();
       for(int i=0;i<m;i++){
           int d = arr1[i];
           int start = 0;
           int end = n-1;
           int count = 0;
           while(start<=end){
               int mid = start+(end-start)/2;
               if(arr2[mid]<=d){
                   count = (mid+1);
                   start = mid+1;
               }
               else{
                   end = mid-1;
               }
           }
           a.add(count);
       }
       return a;
    }
}
