public class Sol3 extends BaseSolution {
    public void runSolution() {
        long num = 37;
        //long start = num / 2;
        //if (start % 2 == 0) start++;

        //for (long i = start; i >= 2; i -= 2) {
        for (long i = 3; i < num / 2; i += 2) {
            if (num % i == 0) {
                System.out.println("DIVISOR FOUND " + i);
                if (Util.isPrime(i)) {
                    System.out.println("ITS PRIME! " + i);
                    //break;                    
                }
            }
        }
    }
}
 
