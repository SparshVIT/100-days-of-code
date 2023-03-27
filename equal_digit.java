class Solution {
    public boolean digitCount(String num) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<num.length();i++){
            char c = num.charAt(i);
            int a = Integer.valueOf(String.valueOf(c));
            if(h.containsKey(a)){
                h.put(a,h.get(a)+1);
            }
            else{
                h.put(a,1);
            }
        }
        boolean check = true;
        for(int i=0;i<num.length();i++){
            int freq = 0;

            if(h.containsKey(i)){
                freq = h.get(i);
            }
            int f = Integer.parseInt(String.valueOf(num.charAt(i)));
            if(f!=freq){
                check = false;
            }
        }
        return check;
    }
}
