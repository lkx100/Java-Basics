class maxNumber {
    public static int max(int a, int b, int c) {
        if (a >= b && b >= c) return a;
        if (b >= c && b >= a) return b;
        if (c >= b && c >= a) return c;
        return -1;
    }
    public static double max(double a, double b) {
        return (a > b) ? a : b;
    }
    public static void main(String[] args) {
        System.out.println("Max of 1, 7, 3 is " + max(1, 7, 3));
        System.out.println("Max of 5.66, 8.03 is " + max(5.66, 8.03));
    }    
}
