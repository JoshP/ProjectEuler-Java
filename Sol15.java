import java.math.*;

public class Sol15 extends BaseSolution {
    
    public void runSolution() {
        int gridSize = 20;
        Long[][] countArray = new Long[gridSize + 1][gridSize + 1];
        System.out.println(findRoutes(0, 0, gridSize, countArray));
    }

    public long findRoutes(int x, int y, int max, Long[][] countArray) {
        if (x == max && y == max) {
            return 1;            
        }
        if (countArray[x][y] != null) {
            return countArray[x][y];
        }

        long count = 0;
        if (x < max) {
            count += findRoutes(x + 1, y, max, countArray);                    
        }
        if (y < max) {
            count += findRoutes(x, y + 1, max, countArray);            
        }
        countArray[x][y] = count;
        return count;
    }
}