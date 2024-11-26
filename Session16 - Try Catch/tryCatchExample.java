public class tryCatchExample {
    public static void main(String[] args) {
        int a = 5, b = 0, result;
        try {
            if (b == 0) throw new Exception("Division by 0 is not possible");
            result = a / b;
        } catch (Exception e) {
            System.out.println(e);
            result = -1;
        }
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("result = " + result);
    }
}
