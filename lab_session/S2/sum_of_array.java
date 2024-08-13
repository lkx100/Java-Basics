public class sum_of_array {
    public static void main(String[] args) {
        // int[] arr = new int[10];
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        for (int i : arr) sum += i;
        System.out.println("Sum of array: " + sum);
    }
}