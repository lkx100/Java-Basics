class ConstructorOverLoad {
    double h, w, l;
    ConstructorOverLoad(double w, double l, double h) {
        this.w = w;
        this.h = h;
        this.l = l;
    }
    ConstructorOverLoad() {
        this.w = -1;
        this.h = -1;
        this.l = -1;
    }
    ConstructorOverLoad(double x) {
        this.w = this.h = this.l = x;
    }
    double volume() {return w*l*h;}
}

public class constructorOverloading {
    public static void main(String[] args) {
        ConstructorOverLoad box1 = new ConstructorOverLoad();
        ConstructorOverLoad box2 = new ConstructorOverLoad(3.2, 4.5, 1.1);
        ConstructorOverLoad box3 = new ConstructorOverLoad(6.9);
        System.out.println("Box1 Volume = " + box1.volume());
        System.out.println("Box2 Volume = " + box2.volume());
        System.out.println("Box3 Volume = " + box3.volume());
    }    
}
