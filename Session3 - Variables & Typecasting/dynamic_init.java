public class dynamic_init {
    public static void main(String [] args) {
        double a = 3.0, b = 4.0;
        double c = Math.sqrt((a*a) + (b*b));   // c is dynamically initialised
        System.out.println("C value is " + c);
    }
}
