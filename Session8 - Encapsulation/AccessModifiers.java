class Test {
    int a, b;   // public by default
    private int c;
    Test(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void setc(int x) {this.c = x;}
    public int getc() {return c;}
}
public class AccessModifiers {
    public static void main(String[] args) {
        Test obj = new Test(3, 6);
        System.out.println("a = " + obj.a + " & b = " + obj.b);
        // obj.c;  --> not possible as it is a private member
        obj.setc(2);
        System.out.println("c = " + obj.getc());
    }    
}
