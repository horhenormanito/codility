// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int len = A.length;
        //int sum = getSumByRange(A, 0, len-1);
        
        int min = Integer.MAX_VALUE;
        
        int[] sum1 = new int[len-1];
        int[] sum2 = new int[len-1];
        
        // Get sum of each left parts
        sum1[0] = A[0];
        int firstSum2 = A[len-1];
        for (int i=1 ; i<len-1 ; i++){
            sum1[i] = sum1[i-1] + A[i];
            // Get the first sum of the right part
            firstSum2+=A[i];
        }
       
        // Get sum of each right parts
        sum2[0] = firstSum2;
        for (int j=1 ; j<len-1 ; j++){
           sum2[j]  = sum2[j-1] - A[j];
        }
        
        for (int k=0 ; k<len-1 ; k++){
            int val = Math.abs(sum1[k] - sum2[k]);
            if(val < min) min = val;
        }
        
        return min;
    }
    
}
