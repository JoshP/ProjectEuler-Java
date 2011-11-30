import java.util.*;
import java.io.*;
import java.math.*;

 public class Sol13 extends BaseSolution {

    public void runSolution() {
        try {
            Scanner scanner = new Scanner(new FileInputStream("Sol13.txt"), "UTF-8");
            BigInteger sum = BigInteger.ZERO;
            while (scanner.hasNextLine()) {
                // only the first 11 digits can affect the first 10 digits of the sum
                sum = sum.add(new BigInteger(scanner.nextLine().substring(0, 11)));
            }
            System.out.println(sum.toString().substring(0, 10));
        } catch (Exception ex) {
            System.err.println(ex);  
        }
    }
}
 


