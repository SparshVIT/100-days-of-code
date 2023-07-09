class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<size;i++){
            int d = arr[i];
            h.put(d,1);
        }
        int i=1;
        while(h.containsKey(i)==true){
            i++;
        }
        return i;
    }
}
