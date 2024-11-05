public class tryCatchExample2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int a = 4, b = 2;
        try {
            System.out.println(arr[5]);
            System.out.println(a/b);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
        System.out.println("Program Ended.");
    }    
}
