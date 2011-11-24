/*
Starting with the number 1 and moving to the right in a clockwise direction a 5 by 5 spiral is formed as follows:

21 22 23 24 25
20  7  8  9 10
19  6  1  2 11
18  5  4  3 12
17 16 15 14 13

It can be verified that the sum of the numbers on the diagonals is 101.

What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?
*/

import java.util.*;

 public class Sol28 extends BaseSolution {
    public void runSolution() {
        System.out.println(sumDiagonals(5));    	
        System.out.println(sumDiagonals(1001));    	    	
    }

    public long sumDiagonals(int sideLength) {
        long sum = 1;
        int currentSideLength = 3;
        long i = 3;
        int currentSide = 1;
        while (currentSideLength <= sideLength) {
            sum += i;
            System.out.println("i = " + i + " currentSideLength = " + currentSideLength);

            if (currentSide != 4) {
                i += currentSideLength - 1;    			
            } else {
                i += currentSideLength + 1;
            }

            currentSide++;
            if (currentSide == 5) {
                currentSide = 1;
                currentSideLength += 2;    			
            }
        }
        return sum;
    }
}
 
