public class Sol6 extends BaseSolution {
    public void runSolution() {
        int sumSquares = 0, sum = 0;
        for (int i = 1; i <= 100; i++) {
            sumSquares += (i * i);
            sum += i;
        }        
        System.out.println(sum*sum - sumSquares);
    }
}