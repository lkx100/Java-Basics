// Superclass
class GrandFather {
    String GFname;
    int GFage;

    void displayGrandFatherBio() {
        System.out.println("GradFather's Name: " + GFname);
        System.out.println("GradFather's Age: " + GFage);
    }
}

// Subclass of GrandFather
class Father extends GrandFather {
    double Fsalary;

    void displayFathersIncome() {
        System.out.println("Father's income: " + Fsalary);
    }
}

// Subclass of Father
class Child extends Father {
    String character, name;

    void displayChildCharachter() {
        System.out.println("Character of " + name + " is: " + character);
    }
}

// Main class to run the program
public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.name = "Rohan";
        ch.character = "Naughty";
        ch.Fsalary = 3600000.00;
        ch.GFage = 79;
        ch.GFname = "Tara Singh";

        ch.displayChildCharachter();
        ch.displayFathersIncome();
        ch.displayGrandFatherBio();
    }
}

