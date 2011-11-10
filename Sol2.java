public class Sol2 extends BaseSolution {
    public void runSolution() {
        int sum = 0;
        int prev1 = 0, prev2 = 1;
        for (int i = 0; ; i++) {
            int savePrev1 = prev1;
            prev1 = prev2;
            prev2 = savePrev1 + prev2;
            if (prev1 >= 4000000)
                break;
            if (prev1 % 2 == 0)
                sum += prev1;
        }

        System.out.println(sum);
    }
}