class Class {
    void display() {
        class InnerMethodClass {
            void message() {
                System.out.println("This is an Inner Method Class");
            }
        }
        InnerMethodClass obj = new InnerMethodClass();
        obj.message();
    }
}
public class methodClass {
    public static void main(String[] args) {
        Class obj = new Class();
        obj.display();
    }    
}
