class Shape {
    public void draw() {System.out.println("I am Shape");}
}

class Circle extends Shape{
    public void draw() {
        System.out.println("I am a Circle"); 
        super.draw();
    }
}

public class methodOveriding {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
    }    
}
