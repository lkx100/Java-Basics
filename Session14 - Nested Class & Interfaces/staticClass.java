class ClassicClass {
    static int age1 = 19;
    int age2 = 19;
    static class StaticClass {  // Static Class can only Acess Static Part of Outer Class
        void display() {
            System.out.println("This is a Static Class");
            System.out.println("age1: " + age1);
            // System.out.println("age2: " + age2);
        }
    }
}
public class staticClass {
    public static void main(String[] args) {
        ClassicClass.StaticClass obj = new ClassicClass.StaticClass();
        obj.display();
    }    
}
