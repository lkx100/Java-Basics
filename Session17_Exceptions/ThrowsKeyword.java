public class ThrowsKeyword {
    public static void evaluate(int num, int deno) throws ArithmeticException {
        if (deno == 0) {
            throw new ArithmeticException("Divide by 0 not possible");
        } else System.out.println("Result = " + num/deno);
    }
    public static void main(String[] args) {
        int num = 8, deno = 0;
        try {
            evaluate(num, deno);
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
}
