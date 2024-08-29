class LivingBeing {
    String str = "Super-Most Class";
    public void mssge() {System.out.println("Iam a living being");}
}

class Human extends LivingBeing {
    public void mssge() {System.out.println("Iam a Human");}
    public void showParent() {
        super.mssge();
        System.out.println(super.str);
    }
}

public class superKeyWord {
    public static void main(String[] args) {
        Human person = new Human();
        person.showParent();
        person.mssge();
    }
}
