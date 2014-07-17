// you can also use imports, for example:
import java.math.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int jumps = 0;
        double distance = 0;
        if (X == Y || X > Y){
            return jumps;
        } else {
            distance = Y - X;
            jumps = (int) Math.ceil(distance/D);
            return jumps;
        }
    }
}