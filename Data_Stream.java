class MedianFinder {
    ArrayList<Integer> a;
    public MedianFinder() {
        a = new ArrayList<>();
    }
    
    public void addNum(int num) {
        if(a.size() == 0) a.add(0, num);  
        else{
            int i=0;
            while(a.get(i) <= num && i<a.size()-1) i++;
            if(a.get(i) <= num) a.add(i+1, num);
            else a.add(i, num);
        }
    }
    
    public double findMedian() {
        double median = 0.0;
        if(a.size()!=0){
            if(a.size()%2!=0){
                median = (double)a.get(a.size()/2);
            }
            else{
                int ind = a.size();
                median = (double)((a.get(ind/2) + a.get(ind/2 - 1)))/2;
            }
        }
        return median;
    }
}
