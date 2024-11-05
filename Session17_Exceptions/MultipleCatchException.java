public class MultipleCatchException {
    public static void main(String[] args) {
        int j = 10, i = 0;
        int[] arr = {1, 2, 3, 4, 5};
        try {
            System.out.println(j + "/" + i + " = " + j/i);
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: " + e);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: " + e);
        }
        catch (Exception e) {
            System.out.println("Unexpected Error");
        }
        System.out.println("Thank You!");
    }
}