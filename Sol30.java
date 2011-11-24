import java.util.*;
import java.math.*;
 public class Sol30 extends BaseSolution {

    public void runSolution() {
        int sum = 0, currentSum = 0;
        for (int i = 10; i <= 999999; i++) {
            currentSum = 0;
            for (int j = 1; j <= i; j *= 10) {
                currentSum += Math.pow((i / j) % 10, 5);
            }
            if (currentSum == i) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
 
