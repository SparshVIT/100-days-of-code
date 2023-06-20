class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> a = new ArrayList<>();
        String c = "";
        for(int i=0;i<searchWord.length();i++){
            c += String.valueOf(searchWord.charAt(i));
            List<String> s = new ArrayList<>();
            for(int j=0;j<products.length;j++){
                if(products[j].indexOf(c)==0){
                    s.add(products[j]);
                }
            }
            if(s.size()>3){
                s = s.subList(0,3);
            }
            a.add(s);
        }
        return a;
    }
}
