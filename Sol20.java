import java.math.*;
import java.text.*;

public class Sol20 extends BaseSolution {
    public void runSolution() {
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= 100; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        String digits = fact.toString();
        long sum = 0;
        for (int i = 0; i < digits.length(); i++) {
            sum += Integer.parseInt(digits.substring(i, i+1));
        }
        System.out.println("sum of digits = " + sum);
    }
}