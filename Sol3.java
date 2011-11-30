public class Sol3 extends BaseSolution {
    public void runSolution() {
        long num = 600851475143L;
        long divider = 2L;
        while (num > 1) {
            if (num % divider == 0) {
                num /= divider;
            } else {
                divider++;
            }
        }
        System.out.println(divider);
    }
}
 
