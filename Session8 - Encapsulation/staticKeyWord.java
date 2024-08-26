class staticClass {
    static int a = 5;
    static int b;
    static void foo(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    static {
        b = a * 10;
    }
}

class staticKeyWord {
    public static void main(String[] args) {
        staticClass.foo(4);
    }
}