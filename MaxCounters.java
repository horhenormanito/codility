// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        
        int[] R = new int[N];
        
        // Initialize all elements to 0
        for (int i=0 ; i<N ; i++){
            R[i] = 0;
        }
        
        // Get initial max and maxCounters
        int max = 0;
        int maxCounters = 0;
        
        for (int j=0 ; j<A.length ; j++){
            int val = A[j];
            
            // If the value is greater than N, set last max counter
            if (val > N){
                maxCounters = max;
            }else{
                // Update specific element, increment by 1
                R[val-1] = Math.max(R[val-1], maxCounters);
                R[val-1]++;
                // Get latest max value
                if (R[val-1] > max) max = R[val-1];
            }
        }
        
        
        for (int i=0 ; i<N ; i++){
           // Check compare max counter versus current set value
           R[i] = Math.max(R[i], maxCounters);
        }
        
        return R;
    }
}
