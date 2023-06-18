class Solution {
    public static int distributeTicket(int N,int K)
    {
        Deque<Integer> q = new ArrayDeque<>();
        for(int i=1;i<=N;i++){
            q.addLast(i);
        }
        while(q.size()!=1){
            for(int i=0;i<K;i++){
                if(q.size()==1){
                    return q.getFirst();
                }
                q.pollFirst();
            }
            for(int i=0;i<K;i++){
                if(q.size()==1){
                    return q.getFirst();
                }
                q.pollLast();
            }
        }
        return q.getFirst();
    }
}
