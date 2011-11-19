public class Util {
    
    public static boolean isPrime(long p) {
        int sqrt = (int)Math.sqrt(p) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (p % i == 0)
                return false;
        }
        return true;
    }
}