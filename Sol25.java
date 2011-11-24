import java.util.*;
import java.math.*;

 public class Sol25 extends BaseSolution {
    public void runSolution() {
        BigInteger prev1 = BigInteger.ZERO;
        BigInteger prev2 = BigInteger.ONE;
        BigInteger savePrev1 = BigInteger.ZERO;
        int n = 0;
        do {
            n++;            
            savePrev1 = prev1;
            prev1 = prev2;
            prev2 = savePrev1.add(prev2);
        } while (prev1.toString().length() < 1000);

        System.out.println("n = " + n + " fib = " + prev1.toString());        
    }
}
 
