class Solution {
    
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<int[]> p = new PriorityQueue<>(
            (a,b)->{
                double i = a[0]/(1.0*a[1]);
                double j = b[0]/(1.0*b[1]);
                if(i>j){
                    return -1;
                }
                return 1;
            }
        );
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int a[] = new int[2];
                a[0] = arr[i];
                a[1] = arr[j];
                p.add(a);
            }
        }
        ArrayList<int[]> l = new ArrayList<>();
        while(p.size()>0){
            l.add(p.remove());
        }
        Collections.reverse(l);
        int b[] = new int[2];
        for(int i=0;i<k;i++){
            b = l.get(i);
        }
        return b;
    }
}
