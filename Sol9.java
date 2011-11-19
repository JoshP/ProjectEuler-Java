 public class Sol9 extends BaseSolution {
    public void runSolution() {
        for (int a = 1; a < 997; a++) {
            for (int b = 2; b < 998; b++) {
                for (int c = 3; c < 999; c++) {
                    if (a + b + c == 1000 && isTriplet(a, b, c)) {
                        System.out.println(a + " " + b + " " + c);
                        System.out.println(a * b * c);
                    }
                }
            }    
        }
    }

    public boolean isTriplet(int a, int b, int c) {
        if (a < b && b < c) {
            if (a * a + b * b == c * c) {
                return true;
            }
        }
        return false;
    }
}
 
