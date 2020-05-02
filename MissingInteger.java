// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        int arrLen = A.length;
        
        // If array length is 0, return 1
        if (arrLen == 0) return 1;
        
        Set<Integer> set = new HashSet<>();
        
        // Add each element in a set
        for (int i=0; i<arrLen ; i++){
             set.add(A[i]);
        }
        
        // Check j in a set    
        for (int j=1 ; j<=arrLen ; j++){
            if (!set.contains(j)) return j;
        }
        
        // else case return array length + 1
        return arrLen+1;
    }
}
