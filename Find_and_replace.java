class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> l = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            HashMap<Character,Character> h = new HashMap<>();
            String a = words[i];
            if(a.length()!=pattern.length()){
                continue;
            }
            else{
                boolean issame = true;
                for(int j=0;j<pattern.length();j++){
                    char c1 = pattern.charAt(j);
                    char c2 = a.charAt(j);
                    if(h.containsKey(c1)){
                        if(h.get(c1)!=c2){
                            issame = false;
                            break;
                        }
                    }
                    else{
                        h.put(c1,c2);
                    }
                    
                }
                if(issame){
                    Set<Character> s1 = new HashSet<>();
                    for(int j=0;j<pattern.length();j++){
                        s1.add(pattern.charAt(j));
                    }
                    Set<Character> s2 = new HashSet<>();
                    for(int j=0;j<a.length();j++){
                        s2.add(a.charAt(j));
                    }
                    if(s1.size()==s2.size()){
                        l.add(a);
                    }
                }
            }
        }
        return l;

    }
}
