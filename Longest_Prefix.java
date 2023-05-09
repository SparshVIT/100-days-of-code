class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longest_prefix = "";
        String prefix = strs[0];
        if(strs.length==1){
            return strs[0];
        }
        for(int i=1;i<strs.length;i++){
            String p = "";
            if(i==1){
                int j = 0;
                int k = 0;
                while(j<strs[i].length() && k<prefix.length()){
                    if(strs[i].charAt(j)==prefix.charAt(k)){
                        p = p+strs[i].charAt(j);
                    }
                    else{
                        break;
                    }
                    j++;
                    k++;
                }
                longest_prefix = p;
            }
            else{
                int j = 0;
                int k = 0;
                while(j<strs[i].length() && k<longest_prefix.length()){
                    if(strs[i].charAt(j)==prefix.charAt(k)){
                        p = p+strs[i].charAt(j);
                    }
                    else{
                        break;
                    }
                    j++;
                    k++;
                }
                longest_prefix = p;
            }
        }
        return longest_prefix;
    }
}
