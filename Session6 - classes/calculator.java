class methodOverLoadingCalculator {

    void add(double a, double b) {System.out.println(a + " + " + b + " = " + (a+b));}
    void add(double a, double b, double c) {System.out.println(a + " + " + b + " + " + c + " = " + (a+b+c));}

    void divide(double a, double b) {
        if (b == 0) System.out.println("Division by 0 Not Possible");
        else System.out.printf(a + " / " + b + " = " + (a/b));
    }

    void multiply(double a, double b) {System.out.println(a + " * " + b + " = " + (a*b));}
    void multiply(double a, double b, double c) {System.err.println(a + " * " + b + " * " + c + " = " + (a*b*c));}

    void subtract(double a, double b) {System.out.println(a + " - " + b + " = " + (a-b));}
    void subtract(double a, double b, double c) {System.out.println(a + " - " + b + " - " + c + " = " + (a-b-c));}
} 

public class calculator {
    public static void main(String[] args) {
        methodOverLoadingCalculator myCalc = new methodOverLoadingCalculator();
        myCalc.add(6, 5);
        myCalc.add(6, 5, 10);

        myCalc.multiply(3, 1, 0);

        myCalc.divide(5, 0);
        myCalc.divide(34, 7);

        myCalc.subtract(100, 30);
    }
}
