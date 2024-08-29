class Animal {
    String name = "Puppy";
    Animal(String name) {this.name = name;}
}

class Dog extends Animal {
    Dog(String name) {super(name);}
    public void display() {System.out.println("Dog Name: " + name);}
}

public class parentConstructorCallUsingSuper {
    public static void main(String[] args) {
        Dog d = new Dog("German Shephard");
        d.display();
    }    
}
