import java.util.*;
import java.io.*;
import java.math.*;

 public class Sol22 extends BaseSolution {

    public void runSolution() {
        try {
            Scanner scanner = new Scanner(new FileInputStream("Sol22.txt"), "UTF-8");
            List<String> nameList = new ArrayList<String>(6000);

            int sum = 0;
            while (scanner.hasNextLine()) {
                String names[] = scanner.nextLine().split(",");
                for (String name : names) {
                    nameList.add(name.substring(1, name.length() - 1));
                }
                Collections.sort(nameList);
                int i = 1;
                for (String name : nameList) {
                    sum += i * getNameScore(name);
                    i++;
                }
            }
            System.out.println(sum);
        } catch (Exception ex) {
            System.err.println(ex);  
        }
    }

    private int getNameScore(String name) {
        int score = 0;
        for (char c : name.toCharArray()) {
            score += (int)c - 64;
        }
        return score;
    }
}
 


