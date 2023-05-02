class Trie {
    ArrayList<String> a;
    public Trie() {
        a = new ArrayList<>();
    }
    
    public void insert(String word) {
        a.add(word);
    }
    
    public boolean search(String word) {
        if(a.contains(word)){
            return true;
        }
        return false;
    }
    
    public boolean startsWith(String prefix) {
        for(String s: a){
            if(s.startsWith(prefix)){
                return true;
            }
        }
        return false;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
