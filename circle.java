class Solution {
    public List<Integer> circle(List<Integer> q,int index, int k){
        if(q.size()==1){
            return q;
        }
        int i = index;
        int count = 1;
        while(count<k){
            i++;
            if(i>=q.size()){
                i = 0;
            }
            count++;
        }
        int element = 0;
        if(i+1>=q.size()){
            element = q.get(0);
        }
        else{
            element = q.get(i+1);
        }
        q.remove(i);
        index = q.indexOf(element);
        return circle(q,index,k);
    } 
    public int findTheWinner(int n, int k) {
        List<Integer>q = new ArrayList<>();
        for(int i=1;i<=n;i++){
            q.add(i);
        }
        int index = 0;
        q = circle(q,index,k);
        return q.get(0);
    }
}
