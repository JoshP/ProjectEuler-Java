public class Sol31 extends BaseSolution {
    
    int[] coins = new int[]{1, 2, 5, 10, 20, 50, 100, 200};

    public void runSolution() {
        System.out.println(find(200, 200));
    }

    public int find(int pence, int startPence) {
        if (pence == 0) 
            return 1;
        int count = 0;
        for (int coin : coins) {
            if (pence >= coin && startPence >= coin) 
                count += find(pence - coin, coin);            
        }
        return count;
    }
}