public class Sol31 extends BaseSolution {
    
    public void runSolution() {
        System.out.println(find(200, 200));
    }

    public int find(int pence, int startPence) {
        if (pence == 0) return 1;
        int count = 0;
        if (pence >= 1 && startPence >= 1) count += find(pence - 1, 1);
        if (pence >= 2 && startPence >= 2) count += find(pence - 2, 2);   
        if (pence >= 5 && startPence >= 5) count += find(pence - 5, 5);
        if (pence >= 10 && startPence >= 10) count += find(pence - 10, 10);
        if (pence >= 20 && startPence >= 20) count += find(pence - 20, 20);
        if (pence >= 50 && startPence >= 50) count += find(pence - 50, 50);
        if (pence >= 100 && startPence >= 100) count += find(pence - 100, 100);
        if (pence >= 200 && startPence >= 200) count += find(pence - 200, 200);
        return count;
    }

}