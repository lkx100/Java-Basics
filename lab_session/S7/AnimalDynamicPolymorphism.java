class AnimalParent {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class DogChild extends AnimalParent {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
    
class CatChild extends AnimalParent {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}
    
public class AnimalDynamicPolymorphism {
    public static void main(String[] args) {
        AnimalParent myAnimal = new DogChild();
        myAnimal.makeSound();
        myAnimal = new CatChild();
        myAnimal.makeSound();
    }
}
