public class find_prime {
    public static void main(String[] args) {
        int num = 14;
        boolean isPrime;
        isPrime = (num < 2) ? false : true; 
        for (int i = 2; i <= num/i; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println((isPrime) ? "Prime Number" : "Not a Prime Number");
    }    
}
