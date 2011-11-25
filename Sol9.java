 public class Sol9 extends BaseSolution {
    public void runSolution() {
        for (int a = 1; a < 997; a++) {
            for (int b = 2; b < 998; b++) {
                for (int c = 3; c < 999; c++) {
                    if (a + b + c == 1000 && Util.isTriplet(a, b, c)) {
                        System.out.println(a + " " + b + " " + c);
                        System.out.println(a * b * c);
                    }
                }
            }    
        }
    }
}
 
