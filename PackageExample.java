import Session15_Packages.Babu.Sweshik;
import Session15_Packages.Babu.Rohan;

public class PackageExample {
    public static void main(String[] args) {
        Sweshik calc1 = new Sweshik();
        Rohan calc2 = new Rohan();
        System.out.println("6 - 4 = " + calc1.subtract(6, 4));
        System.out.println("6 x 4 = " + calc2.multiply(6, 4));
    }
}