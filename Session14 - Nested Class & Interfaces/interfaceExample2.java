interface Movable {
    void move();
}
interface Chargable {
    void charge();
}
class ElectricCar implements Movable, Chargable {
    public void move() {
        System.out.println("Car is Moving");
    }
    public void charge() {
        System.out.println("Car is Charging");
    }
}
public class interfaceExample2 {
    public static void main(String[] args) {
        ElectricCar car = new ElectricCar();
        car.move();
        car.charge();
    }    
}
