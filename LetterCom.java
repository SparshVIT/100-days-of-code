class Solution {
    HashMap<Integer,String> h = new HashMap<>();
     void find(int a[], int d, StringBuilder s, List<String> l){
        if(d==a.length && s.length()==a.length){
            l.add(s.toString());
            return;
        }
        String s1 = h.get(a[d]);
        for(int i=0;i<s1.length();i++){
            s.append(String.valueOf(s1.charAt(i)));
            find(a,d+1,new StringBuilder(s),l);
            s.deleteCharAt(s.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        int arr[] = new int[digits.length()];
        if(digits.length()==0){
            return new ArrayList<>();
        }
        for(int i=0;i<digits.length();i++){
            arr[i] = Integer.parseInt(String.valueOf(digits.charAt(i)));
        }
        h.put(2,"abc");
        h.put(3,"def");
        h.put(4,"ghi");
        h.put(5,"jkl");
        h.put(6,"mno");
        h.put(7,"pqrs");
        h.put(8,"tuv");
        h.put(9,"wxyz");
        List<String> l = new ArrayList<>();
        find(arr,0,new StringBuilder(),l);
        return l;
        
    }
}
