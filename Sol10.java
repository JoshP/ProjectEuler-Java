 public class Sol10 extends BaseSolution {
    public void runSolution() {
        long sum = 0;
        for (int i = 2; i < 2000000; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int p) {
        int sqrt = (int)Math.sqrt(p) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (p % i == 0)
                return false;
        }
        System.out.println(p);
        return true;
    }
}
 
