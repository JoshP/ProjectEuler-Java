public class Sol4 extends BaseSolution {
    public void runSolution() {
        int max = 0;
        for (int i = 999; i >= 100; i--) {
            for (int j = 999; j >= i; j--) {
                if (i * j > max && Util.isPalindrome(i * j)) {
                    System.out.println(i + " " + j);
                    max = Math.max(i * j, max);
                }
            }
        }
        System.out.println("max = " + max);
    }
}