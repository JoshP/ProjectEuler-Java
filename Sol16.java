import java.math.*;

public class Sol16 extends BaseSolution {
    
    public void runSolution() {
        String digits = new BigInteger("2").pow(1000).toString();
        int sum = 0;
        for (int i = 0; i < digits.length(); i++) {
            sum += Integer.parseInt(new Character(digits.charAt(i)).toString());
        }
        System.out.println(sum);
    }
}