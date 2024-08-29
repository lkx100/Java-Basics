class Animal {
    public void makeSound() {System.out.println("Animal Sound");}
}

class Dog extends Animal {
    public void makeSound() {System.out.println("Dog is Barking");}
}

class Cat extends Animal {
    public void makeSound() {System.out.println("Cat is Meowing");}
}

public class dynamicPolymorphism {
    public static void main(String[] args) {
        Animal animal;   // Variable of Animal class
        
        animal = new Dog();  // Variable = instance of Dog --> all Dog methods & attributes
        animal.makeSound();

        animal = new Cat();  // Variable = instance of Cat --> all Cat methods & attributes
        animal.makeSound();
    }    
}
