class Area {
    int a, b;
    Area(int a, int b) {
        this.a = a;
        this.b = b;
    }
    Area(int a) {
        this.a = this.b = a;
    }
    Area() {
        this.a = this.b = -1;
    }
    int area() {return a*b;}
}

public class areaShapeOverloading {
    public static void main(String[] args) {
        Area Rectangle = new Area(3, 4);
        Area Circle = new Area(4);
        Area obj = new Area();
        System.out.println("Rectangle Area = " + Rectangle.area());
        System.out.println("Circle Area = " + Circle.area());
        System.out.println("Any Shape Area = " + obj.area());
    }    
}
