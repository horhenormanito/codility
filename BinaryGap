// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        String str = binaryValue(N);
       
        int sum = 0;
        int sum2 = 0;
        int counter = 0;
        
        boolean oneFlagStart = false;
        
        List<Integer> indecis = new ArrayList<>();
        while(counter < str.length()){
            char s = str.charAt(counter);
            if (s == '1'){
               indecis.add(counter);
            } 
            counter++;
        }
        
        int len = indecis.size();
        sum = 0;
        for (int i=0 ; i<indecis.size()-1 ; i++){
            int diff = indecis.get(i+1) - indecis.get(i) - 1;
            if (diff > sum) sum = diff;
        }
        
        return sum;
    }
    
    String binaryValue (int N){
        StringBuilder sb = new StringBuilder();
        
        while(N>0){
            sb.append(N%2);
            N/=2;
        }
        
        return sb.reverse().toString();
    }
}
