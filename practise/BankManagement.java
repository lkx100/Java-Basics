class InvalidDepositAmountException extends Exception {
    public InvalidDepositAmountException(String message) {
        super(message);
    }
}

class BankAccount {
    public String name, branchName;
    public BankAccount (String name, String branchName) {
        this.name = name;
        this.branchName = branchName;
    }
    public void getBankDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Branch Name: " + this.branchName);
    }
}

class PersonalAccount extends BankAccount {
    private double amount;
    public PersonalAccount(String name, String branchName) {
        super(name, branchName);
        this.amount = 0;
    }
    public void displayCurrentBalance() {
        System.out.println("Current Balance: " + this.amount);
    }
    public synchronized void depositAmount(double amount) throws InvalidDepositAmountException {
        if (amount < 1) throw new InvalidDepositAmountException("Cannot Deposit " + amount + " Amount");
        System.out.println(Thread.currentThread().getName() + " is depositing " + amount);
        this.amount += amount;
        System.out.println(amount + " deposited Successfully!");
        displayCurrentBalance();
    }
    public synchronized void withdrawAmount(double amount) {
        System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
        if (amount > this.amount) {
            System.out.println("Not Enough Balance!");
        } 
        else {
            this.amount -= amount;
            System.out.println(amount + " withdrawn Successfully!");
            displayCurrentBalance();
        }
    }
    public void showDetails() {
        getBankDetails();
        System.out.println("Balance Left: " + this.amount);
    }
}

public class BankManagement {
    public static void main(String[] args) {
        PersonalAccount myAccount = new PersonalAccount("Lucky", "Neredmet Branch");
        myAccount.showDetails();

        // Create two threads for concurrent banking operations
        Thread thread1 = new Thread(() -> {
            try {
                myAccount.depositAmount(1000);
                Thread.sleep(100); // Simulate some processing time
                myAccount.withdrawAmount(500);
            } catch (InvalidDepositAmountException | InterruptedException e) {
                System.out.println("Thread 1 Error: " + e.getMessage());
            }
        }, "Thread-1");

        Thread thread2 = new Thread(() -> {
            try {
                myAccount.depositAmount(2000);
                Thread.sleep(100); // Simulate some processing time
                myAccount.withdrawAmount(1000);
            } catch (InvalidDepositAmountException | InterruptedException e) {
                System.out.println("Thread 2 Error: " + e.getMessage());
            }
        }, "Thread-2");

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for both threads to complete
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        // Show final account details
        System.out.println("\nFinal Account Status:");
        myAccount.showDetails();
    }
}
