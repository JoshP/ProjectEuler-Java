 public class Sol10 extends BaseSolution {
    public void runSolution() {
        long sum = 0;
        for (int i = 2; i < 2000000; i++) {
            if (Util.isPrime(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
 
