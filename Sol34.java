public class Sol34 extends BaseSolution {
    int[] factorials = new int[10];

    public void runSolution() {
        // pre calculate factorials
        for (int i = 0; i < 10; i++) {
            factorials[i] = factorial(i);
        }

        int sum = 0;
        for (int i = 10; i <= 2540160; i++) {
            if (i == sumOfFactDigits(i)) {
                System.out.println("FOUND " + i);
                sum += i;
            }
        }

        System.out.println(sum);
    }

    public int sumOfFactDigits(int n) {
        int sum = 0;
        while (n > 0) {
            //System.out.println(n % 10 + " " + factorials[n % 10]);
            sum += factorials[n % 10];
            n = n / 10;
        }
        return sum;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;        
        return fact;
    }
}