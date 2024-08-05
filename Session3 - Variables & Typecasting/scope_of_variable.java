public class scope_of_variable {
    public static void main(String [] args) {
        int x;
        x = 10;
        if (x == 10) {
            int y = 20;
            System.out.println("Value of x & y are " + x + " " + y);
        }
        // y = 100 --> Error, as y is not in scope
        System.out.println("Value of x is " + x);
    }
}
