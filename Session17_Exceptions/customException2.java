class InsufficientBalance extends Exception {
    InsufficientBalance(String message) {
        super(message);
    }
}
public class customException2 {
    private double balance;
    customException2(double balance) {
        this.balance = balance;
    }
    public void withdraw(double amount) throws InsufficientBalance{
        if (amount > balance) throw new InsufficientBalance("Insufficient Balance");
        balance -= amount;
        System.out.println("Withdraw Successfull");
    }
    public static void main(String[] args) {
        customException2 accnt = new customException2(4000);
        try {
            accnt.withdraw(31400); 
        } catch (InsufficientBalance e) {
            System.out.println(e);
        }
    }
}
