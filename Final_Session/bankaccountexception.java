class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class bankaccountexception {
    private double balance;

    public bankaccountexception(double balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        bankaccountexception account = new bankaccountexception(100);
        try {
            account.withdraw(150);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Current balance: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}
