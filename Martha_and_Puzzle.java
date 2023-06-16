import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static ArrayList<Integer> harderPuzzle(int n, ArrayList<Integer> puzzle) 
	{
        // Write your code here.
        ArrayList<Integer> p = new ArrayList<>();
        for(int i=0;i<puzzle.size();i++){
            int d = puzzle.get(i);
            boolean result = false;
            for(int j=i+1;j<puzzle.size();j++){
                if(puzzle.get(j)>puzzle.get(i)){
                    result = true;
                    p.add(j-i);
                    break;
                }
            }
            if(result == false){
                p.add(0);
            }
        }
        return p;

    }
}
