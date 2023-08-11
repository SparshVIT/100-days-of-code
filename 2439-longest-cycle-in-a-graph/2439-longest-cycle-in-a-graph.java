class Solution {
    public int longestCycle(int[] edges) {
        int maxLenCycle=-1,n=edges.length,visTime[]=new int[n],time=1;
        for(int st=0;st<n;st++){
            if(visTime[st]==0){
                int start=time,i=st;
                while(i!=-1 && visTime[i]==0){
                    visTime[i]=time++;
                    i=edges[i];
                }
                if(i!=-1 && visTime[i]>=start)  
                    maxLenCycle=Math.max(maxLenCycle,time-visTime[i]);
            }   
        }
        return maxLenCycle;
    }
}