class BankAccount1 {
    private int balance = 1000;

    // Synchronize the withdraw method to prevent race conditions
    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is going to withdraw $" + amount);
            balance -= amount;

            System.out.println(Thread.currentThread().getName() + " completed withdrawal Remaining balance:$ " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " attempted to withdraw $" + amount + " but insufficient balance.");
        }
    }

    public int getBalance() {
        return balance;
    }
}

class WithdrawalThread extends Thread {
    private BankAccount1 account;
    private int amount;

    public WithdrawalThread(BankAccount1 account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(amount);
    }
}

public class SynchronizedExample {
    public static void main(String[] args) {
        BankAccount1 account = new BankAccount1();
        WithdrawalThread t1 = new WithdrawalThread(account, 800);
        WithdrawalThread t2 = new WithdrawalThread(account, 800);
        t1.start();
        t2.start();
    }
}
