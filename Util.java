public class Util {
    
    public static boolean isPrime(long p) {
        long sqrt = (long)Math.sqrt(p) + 1;
        for (long i = 2; i < sqrt; i++) {
            if (p % i == 0)
                return false;
        }
        return true;
    }
}