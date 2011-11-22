import java.util.*;

 public class Sol19 extends BaseSolution {
    public void runSolution() {
        int count = 0;
        Calendar cal = Calendar.getInstance();
        cal.set(1901, 1, 1);
        while (cal.get(Calendar.YEAR) != 2001) {
            if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY && 
                    cal.get(Calendar.DAY_OF_MONTH) == 1) {
                count++;
            }
            cal.add(Calendar.DAY_OF_MONTH, 1);            
        }
        System.out.println(count);
    }
}
 
