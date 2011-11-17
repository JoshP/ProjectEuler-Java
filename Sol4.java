public class Sol4 extends BaseSolution {
    public void runSolution() {
        int max = 0;
        for (int i = 999; i >= 100; i--) {
            for (int j = 999; j >= i; j--) {
                if (i * j > max && isPalindrome(i * j)) {
                    System.out.println(i + " " + j);
                    max = Math.max(i * j, max);
                }
            }
        }
        System.out.println("max = " + max);
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