// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        
        //Arrays.stream(A).boxed().forEach((k) -> System.out.print(k + " "));
        //System.out.println();
        
        int len = A.length;
        
        if(len == 0) return 1;
        
        return binarySearch(A, 0, len-1);
    }
    
    private int binarySearch(int[] A, int firstIdx, int lastIdx){
            
        int midIdx = (firstIdx + lastIdx)/2;
        
        //System.out.println("First: " + A[firstIdx]);
        //System.out.println("Mid: " +  A[midIdx]);
        //System.out.println("Last: " +  A[lastIdx]);
        
        if (A.length < 2 ){
            if (A[firstIdx] > (firstIdx+1)){
                return firstIdx+1;
            }else{
                return A[firstIdx]+1;
            }
        } 
        
        if (A[firstIdx+1] != (firstIdx+2)){
            if (A[firstIdx] != (firstIdx+1)){
                return firstIdx+1;
            }else{
                //System.out.println("** " + (firstIdx+2));
                return firstIdx+2;
            }
        }
        
        if (A[lastIdx] == lastIdx+1){
            //System.out.println("*** " + (A[lastIdx]+1));
            return A[lastIdx]+1;
        }
        
        if (A[midIdx] != (midIdx+1)){
            
            // Traverse left tree
            if (A[midIdx] > (midIdx+1)){
               //System.out.println(" > " + A[midIdx]);
               return  binarySearch(A, firstIdx, midIdx);
            }else{
               // Traverse right tree
               //System.out.println(" >> " + A[midIdx]);
               return binarySearch(A, midIdx, lastIdx);
            } 
        }else{
            // Traverse right tree
            //System.out.println(" >>> " + A[midIdx]);
            return binarySearch(A, midIdx, lastIdx);
        }
    }
}
