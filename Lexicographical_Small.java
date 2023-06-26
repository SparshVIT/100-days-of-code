class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int i = 0;
        int j = letters.length-1;
        char small = '#';
        while(i<=j){
            int mid = i+(j-i)/2;
            if(letters[mid]>target){
                j = mid-1;
                small = letters[mid];
            }
            else if(letters[mid]<=target){
                i = mid+1;
            }
        }
        if(small=='#'){
            small = letters[0];
        }
        return small;
    }
}
