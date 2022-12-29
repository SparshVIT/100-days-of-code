
// User function Template for Java

class Solution {
    public static int[] asteroidCollision(int N, int[] asteroids) {
        // code here
        Stack<Integer> s = new Stack<>();
        s.push(asteroids[0]);
        for(int i=1;i<asteroids.length;i++){
            boolean burst = false;
            if(asteroids[i]<0){
                if(s.size()==0){
                    s.push(asteroids[i]);
                }
                else if(s.peek()<0){
                    s.push(asteroids[i]);
                }
                else if(s.peek()>Math.abs(asteroids[i])){
                    continue;
                }
                else{
                    while(s.peek()<=Math.abs(asteroids[i])){
                        if(s.peek()==Math.abs(asteroids[i])){
                            s.pop();
                            burst = true;
                            break;
                        }
                        else if(s.peek()<0){
                            break;
                        }
                        else{
                            s.pop();
                            if(s.size()==0){
                                break;
                            }
                        }
                        if(s.peek()>Math.abs(asteroids[i])){
                            burst = true;
                            break;
                        }
                    }
                   
                    if(burst==true){
                        continue;
                    }
                    else{
                        s.push(asteroids[i]);
                    }
                }
            }
            else{
                s.push(asteroids[i]);
            }
        }
        int arr[] = new int[s.size()];
        if(s.size()==0){
            return arr;
        }
        for(int i=0;i<s.size();i++){
            arr[i] = s.get(i);
        }
        return arr;
    }
}
public class MyClass {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}