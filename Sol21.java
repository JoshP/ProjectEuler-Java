/*
Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a  b, then a and b are an amicable pair and each of a and b are called amicable numbers.

For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

Evaluate the sum of all the amicable numbers under 10000.
*/
import java.util.*;

 public class Sol21 extends BaseSolution {

    int[] amicableArray = new int[10000];

    public void runSolution() {
        int sum = 0;
        for (int i = 1; i < 10000; i++) {
            int divisorSum = sumDivisors(i);
            if (divisorSum < 10000 && amicableArray[divisorSum] == i) {
                System.out.println("adding pair " + i + " " + divisorSum);
                sum += i + divisorSum;
            }
            amicableArray[i] = divisorSum;            
        }
        System.out.println(sum);
    }

    public int sumDivisors(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) sum += i;
        }
        return sum;
    }
}
 
