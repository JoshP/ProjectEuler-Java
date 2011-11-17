public class Sol4 extends BaseSolution {
    public void runSolution() {
        int max = 0;
        for (int i = 100; i <= 999; i++) {
            for (int j = 100; j <= 999; j++) {
                int product = i * j;
                if (isPalindrome(product)) {
                    max = Math.max(product, max);
                }
            }
        }
        System.out.println(max);
    }

    public boolean isPalindrome(int n) {
        String a = String.valueOf(n);
        for (int i = 0; i < a.length() / 2; i++) {
            if (a.charAt(i) != a.charAt(a.length() - 1 - i))
                return false;
        }
        System.out.println("palindrome = " + n);
        return true;
    }
}