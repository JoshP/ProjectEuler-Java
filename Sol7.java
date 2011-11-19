 public class Sol7 extends BaseSolution {
    public void runSolution() {
        int primeCount = 0, i = 2, prime = 0;
        while (primeCount != 10001) {
            if (Util.isPrime(i)) {
                primeCount++; prime = i;
                System.out.println("prime " + primeCount + " = " + prime);
            }
            i++;
        }
        System.out.println(prime);
    }
}
 
