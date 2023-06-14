class WordDictionary {
    ArrayList<String> h;
    HashMap<String,Integer> h1 = new HashMap<>();
    public WordDictionary() {
        h = new ArrayList<>();
    }
    
    public void addWord(String word) {
        h.add(word);
        h1.put(word,1);
    }
    
    public boolean search(String word) {
        if(word.length()==0){
            return false;
        }
        int index = word.indexOf('.');
        boolean result = false;
        if(h.size()==0){
            return false;
        }
        boolean r = true;
        if(index!=-1){
            for(int i=0;i<h.size();i++){
                r = true;
                int l1 = word.length();
                int l2 = h.get(i).length();
                if(l1!=l2){
                    r = false;
                }
                else{
                    for(int j=0;j<word.length();j++){
                        if(word.charAt(j)=='.'){
                            continue;
                        }
                        if(word.charAt(j)!=h.get(i).charAt(j)){
                            r = false;
                            break;
                        }
                        else{
                            r = true;
                        }
                    }
                    if(r==true){
                        break;
                    }
                }
            }
            if(r==true){
                result = true;
            }
        }
        else{
            if(h1.containsKey(word)){
                return true;
            }
        }
        return result;
    }
}
