public class boolean_datatype {
    public static void main(String [] args) {
        boolean b;   // Declaring boolean data type
        b = false;   // Initializing b
        System.out.println("Value of b is " + b);
        b = true;    // Updating b
        System.out.println("Value of b is " + b);
        if (b) System.out.println("This will be executed");
        b = false;
        if (b) System.out.println("This won't be executed");
        System.out.println("(10 < 9) is " + (10 < 9));
    }
}
