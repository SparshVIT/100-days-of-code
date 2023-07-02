class Solution
{
    public int NthRoot(int n, int m)
    {
        // code here
        int l = 0;
        int h = m;
        while(l<=h){
            int mid = l+(h-l)/2;
            if((int)(Math.pow(mid,n))==m){
                return mid;
            }
            else if((int)(Math.pow(mid,n))<m){
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }
        return -1;
    }
}
