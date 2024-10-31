interface Animal {
    void makeSound();
    default void walk() {
        System.out.println("Animal is Walking");
    }
}
class Dog implements Animal {
    // "public" is required to mention in method, while implementing an interface incomplete method
    public void makeSound() {
        System.out.println("Dog is Barking");
    }
}
public class interfaceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.walk();
    }    
}
