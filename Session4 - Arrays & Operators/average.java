public class average {
    public static void main(String[] args) {
        double[] arr = {10.1, 11.2, 12.3, 13.4, 14.5};
        double ans = 0;
        for (var i : arr) ans += i;
        System.out.println("Average = " + ans / arr.length);
    }
}