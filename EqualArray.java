class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        boolean check = true;
        HashMap<Long, Integer> h = new HashMap<>();
        for(int i=0;i<A.length;i++){
            long a = A[i];
            if(h.containsKey(a)){
                h.put(a,h.get(a)+1);
            }
            else{
                h.put(a,1);
            }
        }
        for(int i=0;i<B.length;i++){
            long a = B[i];
            if(h.containsKey(a)==true){
                h.put(a,h.get(a)-1);
            }
            else{
                check = false;
                break;
            }
        }
        if(check == false){
            return check;
        }
        for(long a: h.keySet()){
            if(h.get(a)!=0){
                check = false;
                break;
            }
        }
        return check;
    }
}
