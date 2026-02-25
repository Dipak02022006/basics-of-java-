// Parent class
class BankAccount {
    protected double balance;

    // Constructor
    BankAccount(double balance) {
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
        System.out.println("Current Balance: " + balance);
    }
}

// Child class
class SavingsAccount extends BankAccount {

    // Constructor
    SavingsAccount(double balance) {
        super(balance);
    }

    // Overriding withdraw method
    @Override
    void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal denied! Minimum balance of 100 must be maintained.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Current Balance: " + balance);
        }
    }
}

// Main class
public class balanceamount {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(500);

        sa.deposit(200);
        sa.withdraw(550);   // allowed
        sa.withdraw(100);   // not allowed
    }
}
