// Superclass
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Dog
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Subclass Cat
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

// Main class to run the program
public class DynamicPolymorphism {
    public static void main(String[] args) {
        // Superclass reference pointing to subclass objects
        Animal myAnimal = new Dog(); // Dog object referenced by Animal type
        myAnimal.makeSound(); // Dog's makeSound method is called

        myAnimal = new Cat(); // Cat object referenced by Animal type
        myAnimal.makeSound(); // Cat's makeSound method is called
    }
}
