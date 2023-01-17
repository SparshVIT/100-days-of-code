class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        int index1 = 0;
        int index2 = 0;
        while(i<j){
            if(numbers[i]+numbers[j]<target){
                i++;
            }
            else if(numbers[i]+numbers[j]>target){
                j--;
            }
            else{
                index1 = i+1;
                index2 = j+1;
                break;
            }
        }
        int arr[] = new int[2];
        arr[0] = index1;
        arr[1] = index2;
        return arr;
    }
}
public class MyClass {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}