// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int[] A) {
        
        // Marked each position
        Set<Integer> markedPos = new HashSet<>();
        for (int i=1 ; i<=X ; i++){
            markedPos.add(i);
        }
        
        for (int i=0 ; i<A.length ; i++){
            // Remove marked position
            if (markedPos.remove(A[i])){
                // If no more marked position flag, return index as the time 
                if (markedPos.size() == 0){
                    return i;
                }
            }
        }
        
        return -1;
        
    }
}
