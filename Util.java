public class Util {
    
    public static boolean isPrime(long p) {
        long sqrt = (long)Math.sqrt(p) + 1;
        for (long i = 2; i < sqrt; i++) {
            if (p % i == 0)
                return false;
        }
        return true;
    }

    public static int countLetters(String words) {
        int sum = 0;
        for (int i = 0; i < words.length(); i++) {
            if (Character.isLetter(words.charAt(i))) {
                sum++;
            }
        }
        return sum;
    }    

    public static boolean isPalindrome(int n) {
        return isPalindrome(String.valueOf(n));
    }
    
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) 
                return false;
        }
        return true;
    }        

    public static boolean isTriplet(int a, int b, int c) {
        if (a < b && b < c) {
            if (a * a + b * b == c * c) {
                return true;
            }
        }
        return false;
    }

}