public class Sol5 extends BaseSolution {
    public void runSolution() {
        bruteForce();
    }

    public void bruteForce() {
        int start = 20;
        while (true) {
            if (start % 20 == 0 && start % 19 == 0 && start % 18 == 0 && start % 17 == 0 &&
                start % 16 == 0 && start % 15 == 0 && start % 14 == 0 && start % 13 == 0 &&
                start % 12 == 0 && start % 11 == 0) {
                    break;
            }
            start++;
        }
        System.out.println(start);        
    }
}