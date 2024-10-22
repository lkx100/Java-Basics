class printData {
    void print(int a) {
        System.out.println("Integer " + a);
    }
    void print(double a) {
        System.out.println("Double " + a);
    }
    void print(String a) {
        System.out.println("String " + a);
    }
}

public class printOverloading {
    public static void main(String[] args) {
        printData obj = new printData();
        obj.print("Lucky Kumar");
        obj.print(5);
        obj.print(5.23);
    }    
}
