// you can also use imports, for example:
import java.math.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        long sumRight = 0;
        long sumLeft = 0;
        long minVal = 3000;
        long diff = 0;
        
        
        if (A.length <= 0){
            return -1;
        }
        else if (A.length == 1){
            return A[0];
        } 
        else if (A.length == 2) {
            return Math.abs(A[0] - A[1]); 
        }
        else {
            for (int i = 0; i < A.length; i++){
                sumRight += A[i] ;
            }
            for (int i = 0; i < A.length; i++){
                sumRight -= (long) A[i];
                sumLeft += (long) A[i];
                diff = Math.abs(sumLeft - sumRight); 
                
                if ( diff < minVal){
                    minVal = diff; 
                }
            }
            return (int) minVal;
        }
    }
}