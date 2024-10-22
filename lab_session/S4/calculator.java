class MyCalculator {
    public static int add(int a, int b) {return a + b;}
    public static int add(int a, int b, int c) {return a + b + c;}
    public static int subtract(int a, int b) {return a - b;}
    public static int subtract(int a, int b, int c) {return a - b - c;}
    public static int multiply(int a, int b) {return a * b;}
    public static int divide(int a, int b) {
        return (b != 0) ? a/b : -1;
    }
}

public class calculator {
    public static void main(String[] args) {
        MyCalculator obj = new MyCalculator();
        System.out.println("3 + 7 = " + obj.add(3, 7));
        System.out.println("10 - 3 - 2 = " + obj.subtract(10, 3, 2));
        System.out.println("8 / 2 = " + obj.divide(8, 2));
    }
}

