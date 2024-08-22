class Box {
    int height, width, depth;
    Box(int height, int width, int depth) {
        System.out.println("You declared a Cuboid");
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    Box() {
        System.out.println("Please use different Constructor");
        System.out.println("This is an Empty constructor");
    }
    Box(int height) {
        System.out.println("You declared a Cube");
        this.height = this.width = this.depth = height;
    }
    public void getVolume() {
        System.out.println(this.height * this.width * this.depth);
    }
}
class class_example {
    public static void main(String[] args) {
        Box box1 = new Box(2, 3, 4);
        Box box2 = new Box();
        Box box3 = new Box(4);
        System.out.println("Height: " + box1.height);
        box1.getVolume();
    }
}