class Engine {
    Engine() {System.out.println("Engine Created");}
}

class Car {
    private final Engine engine;  // Composition
    Car() {
        engine = new Engine();
        System.out.println("Car created");
    }
}

public class composition {
    public static void main(String[] args) {
        Car car = new Car();
    }    
}
