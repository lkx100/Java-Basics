class methodOverload {
    void method() {System.out.println("This is a Void Method");}
    void method(int a) {System.out.println("Value of Integer is " + a);}
    void method(double a) {System.out.println("Value of Double is " + a);}
    void method(int a, int b) {System.out.println("a = " + a + " & b = " + b);}
}

public class overloadMethodDemo {
    public static void main(String[] args) {
        methodOverload obj1 = new methodOverload();
        obj1.method();
        obj1.method(43);
        obj1.method(6.23);
        obj1.method(12, 5);
    }
}
