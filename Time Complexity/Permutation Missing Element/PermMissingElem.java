// you can also use imports, for example:
// import java.math.*;
import java.util.Arrays;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        long currVal = 0;
        if (A.length == 0 || A.length == 1){
            return 0;
        }
        else if (A[0] != 1){
            return 1;
        }
        else{
            for(int i = 0; i < A.length; i++){
                currVal = A[i];
                if (i == A.length){
                    return 0;
                }
                if (A[i + 1] != ((int)currVal + 1)){
                    return ((int)currVal + 1);
                }        
            }
            return 0;
        }
    }
}