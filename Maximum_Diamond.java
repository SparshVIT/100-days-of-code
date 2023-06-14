class Solution {
    static long maxDiamonds(int[] A, int N, int K) {
        // code here
        long value = 0;
        PriorityQueue<Long> p = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<N;i++){
            p.add((long)A[i]);
        }
        for(int i=0;i<K;i++){
            long d = p.remove();
            value = value+d;
            p.add((long)d/2);
        }
        return value;
    }
};
