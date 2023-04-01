

//User function Template for Java

/*
class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}
*/

class Solution {
    
    public pair indexes(long v[], long x)
    {
        // Your code goes here
        int start = 0;
        int end =  v.length-1;
        long first = -1;
        long last = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(v[mid]==x){
                first = mid;
                end = mid-1;
            }
            else if(v[mid]<x){
                start = mid+1;
            }
            else{
                end  = mid-1;
            }
        }
        start = 0;
        end = v.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(v[mid]==x){
                last = mid;
                start = mid+1;
            }
            else if(v[mid]<x){
                start = mid+1;
            }
            else{
                end  = mid-1;
            }
        }
        pair p = new pair(first,last);
        return p;
        
    }
}
