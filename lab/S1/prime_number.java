public class prime_number {
    public static boolean isPrime(int n) {
        if (n == 1 || n == 0) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }
    public static void main(String [] args) {
        int num = 100;
        System.out.print("Prime Number between 1 to " + num + " are: ");
        for (int i = 0; i <= num; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
    }
}
