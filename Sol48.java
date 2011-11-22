 import java.math.*;

 public class Sol48 extends BaseSolution {
    public void runSolution() {
        BigInteger sum = BigInteger.ZERO;
        for (int i = 1; i <= 1000; i++) {
            sum = sum.add(BigInteger.valueOf(i).pow(i));
        }
        System.out.println("last 10 = " + sum.toString().substring(sum.toString().length() - 10));
    }
}
 
