class constructorOverload {
    constructorOverload() {System.out.println("This is an empty constructor");}
    constructorOverload(int a) {System.out.println("Contructor with 1 para --> a = " + a);}
    constructorOverload(int a, int b) {System.out.println("Contructor with 2 para --> a = " + a + " & b = " + b);}
}

public class overloadConstructorDemo {
    public static void main(String[] args) {
        constructorOverload obj1 = new constructorOverload();
        constructorOverload obj2 = new constructorOverload(5);
        constructorOverload obj3 = new constructorOverload(2, 19);
    }
}
