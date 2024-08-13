public class reverse_array {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};  // Original Array
        int[] reverse = new int[5];
        for (int i = arr.length-1; i >= 0; i--)
            reverse[arr.length-i-1] = arr[i];    // reverse logic
        System.out.print("Original Array: ");
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
        System.out.print("Reversed Array: ");
        for (int i : reverse) System.out.print(i + " ");
    }    
}
