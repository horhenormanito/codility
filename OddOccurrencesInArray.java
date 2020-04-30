// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        //Arrays.stream(A).boxed().forEach(System.out::println);
        
        int len = A.length;
        int val = A[len-1];
        for (int i=0 ; i<len-1 ; i++){
            if (A[i] == A[i+1]){
                i++;
            }else{
                val = A[i];
                break;
            }
        }
        
        return val;
    }
}
