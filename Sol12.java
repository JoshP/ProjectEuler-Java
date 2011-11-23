import java.util.*;

 public class Sol12 extends BaseSolution {
    public void runSolution() {
        int i = 1;
        long triangleSum = 1L;
        while (true) {
            i++;
            triangleSum += i;
            int divisors = countDivisors(triangleSum);            
            System.out.println("i = " + i + " triangle = " + triangleSum + " divisors = " + divisors);
            if (divisors > 500) break;
        }
        System.out.println(triangleSum);
    }

    public int countDivisors(long n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        return count;        
    }
}
 
