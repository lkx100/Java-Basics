class OuterClass {
    private int age = 19;
    class InnerClass {
        int num = 8;
        void display() {
            System.out.println("This is Inner Class");
        }
    }
}
class nonStaticClass {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}