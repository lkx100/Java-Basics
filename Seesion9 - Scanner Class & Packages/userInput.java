import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int n = sc.nextInt();
        if (n % 2 == 0) System.out.println("Your Number is " + n + " --> Even");
        else System.out.println("Your Number is " + n + " --> Odd");

        sc.close();
    }    
}
