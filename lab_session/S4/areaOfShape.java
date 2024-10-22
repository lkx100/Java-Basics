class Area {
    public static int area(int a, int b) {
        return a * b;
    }
    public static int area(int a) {
        return a * a;
    }
    public static double area(double a) {
        return 3.14 * a * a;
    }
}

public class areaOfShape {
    public static void main(String[] args) {
        Area obj = new Area();
        System.out.println("Area of Square of side (4 units): " + obj.area(4));
        System.out.println("Area of Rectangle of side (4, 5 units): " + obj.area(4, 5));
        System.out.println("Area of Circle of side (2 units): " + obj.area(2.45));
    }    
}
