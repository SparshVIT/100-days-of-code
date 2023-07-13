class Node{
    String url;
    Node prev;
    Node next;
    Node(String url){
        this.url = url;
    }
}
class BrowserHistory {
    Node home;
    Node temp;
    Node r;
    public BrowserHistory(String homepage) {
        home = new Node(homepage);
        home.prev= null;
        home.next = null;
        temp = home;
        r = temp;
        //count++;
    }
    
    public void visit(String url) {
        Node t = new Node(url);
        r.next = t;
        t.prev = r;
        t.next = null;
        r = t;
        //count++;
    }
    
    public String back(int steps) {
        int i = 0;
        while(r.prev!=null && i<steps){
            System.out.println(r.url);
            r = r.prev;
            i++;
        }
        return r.url;
    }
    
    public String forward(int steps) {
        int i = 0;
        while(r.next!=null && i<steps){
            r = r.next;
            i++;
        }
        return r.url;
    }

}
