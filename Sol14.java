import java.util.*;

 public class Sol14 extends BaseSolution {
    public void runSolution() {
        int maxChain = 0, chain = 0, start = 0;
        for (int i = 999999; i > 1; i--) {
            chain = countChain(i);
            if (chain > maxChain) {
                maxChain = chain;
                start = i;
            }
            System.out.println(i + " " + chain);
        }
        System.out.println("max " + start + " " + maxChain);
    }

    public int countChain(long n) {
        int count = 1;
        while (n > 1) {
            if (n % 2 == 0) n = n / 2;
            else n = 3 * n + 1;
            count++;
        }
        return count;
    }
}
 
