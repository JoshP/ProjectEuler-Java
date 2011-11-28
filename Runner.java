public class Runner {
    
    public static void main(String[] args) {
        if (args.length == 1) {
            try {
                Class c = Class.forName("Sol" + args[0]);
                Object sol = c.newInstance();
                long currentTime = System.currentTimeMillis();
                ((BaseSolution)sol).runSolution();            
                System.out.println("finished in " + (System.currentTimeMillis() - currentTime) + "ms");    
            } catch (Exception ex) {
                System.err.println(ex);
            }
        }

    }
}