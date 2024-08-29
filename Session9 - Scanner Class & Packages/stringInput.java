import java.util.Scanner;

public class stringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input for Multi Word: ");
        String multiWord = sc.nextLine();   // Full Line
        System.out.println("Full Name: " + multiWord);
        System.out.print("Input for Single Word: ");
        String singleWord = sc.next();   // Single Word
        System.out.println("First Name: " + singleWord);
        sc.close();
    }    
}
