class Solution{
    
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(long arr[], int n){
        
        // Your code here
        ArrayList<Long> p1 = new ArrayList<>();
        for(int i=0;i<n;i++){
            p1.add(arr[i]);
        }
        Collections.sort(p1);
        int x = 0;
        int y = n-1;
        ArrayList<Long> a = new ArrayList<>();
        int j = 0;
        while(a.size()!=n){
            if(j%2==0){
                a.add(p1.get(y));
                y--;
            }
            else{
                a.add(p1.get(x));
                x++;
            }
            j++;
        }
        for(int i=0;i<n;i++){
            arr[i] = a.get(i);
        }
        
    }
    
}


