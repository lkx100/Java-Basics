public class FinallyMultipleCatch {
    public static void main(String[] args) {
        String name = null;
        try {
            System.out.println(name);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch (NullPointerException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Task Done!");
        }
    }    
}
