public class if_condition {
    public static void main(String [] args) {
        int n1 = 10, n2 = 20;   // Initializing variables
        if (n1 < n2) System.out.println("n1 is smaller than n2");
        n1 *= 2; // update n1
        if (n1 == n2) System.out.println("n1 equals n2");
        n1 *= 2;  // update n1
        if (n1 > n2) System.out.println("n1 is less than n2");
        if (n1 == n2) System.out.println("This line won't be executed");
    }
}
