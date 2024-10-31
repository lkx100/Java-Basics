interface InterfaceA {
    default void show() {System.out.println("Interface A");}
}
interface InterfaceB {
    default void show() {System.out.println("Interface B");}
}
class DiamondClass implements InterfaceA, InterfaceB {
    public void show() {
        InterfaceA.super.show();
        InterfaceB.super.show();
        System.out.println("Custom display method in DiamondClass");
    }
}
public class diamondProblem {
    public static void main(String[] args) {
        DiamondClass dc = new DiamondClass();
        dc.show();
    }    
}
