public class Runner {
    
    public static void main(String[] args) {
        if (args.length == 1) {
            try {
                Class c = Class.forName("Sol" + args[0]);
                Object sol = c.newInstance();
                ((BaseSolution)sol).runSolution();                
            } catch (Exception ex) {
                System.err.println(ex);
            }
        }

    }
}