import java.util.*;
import java.math.*;

 public class Sol55 extends BaseSolution {
    public void runSolution() {
        int count = 0;
        for (int i = 1; i < 10000; i++) {
            if (isLychrel(i)) {
                count++;
                System.out.println(i + " was lychrel");  
            } 
        }
        System.out.println(count);
    }

    public boolean isLychrel(int num) {
        BigInteger bigNum = BigInteger.valueOf(num);
        for (int i = 0; i < 50; i++) {
            bigNum = bigNum.add(reverse(bigNum));
            if (Util.isPalindrome(bigNum.toString())) 
                return false;
        }
        return true;
    }

    public BigInteger reverse(BigInteger num) {
        StringBuilder builder = new StringBuilder(num.toString());
        return new BigInteger(builder.reverse().toString());
    }
}
 
