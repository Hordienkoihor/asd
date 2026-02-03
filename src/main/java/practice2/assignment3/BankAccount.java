package practice2.assignment3;

public class BankAccount {
    private final String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;

        if (balance < 0) {
            throw new RuntimeException("Negative balance");
        }
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new RuntimeException("Negative balance deposit");
        }
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < 0 || amount > balance) {
            throw new RuntimeException("Negative or excessive balance withdrawal");
        }
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "Account number " + accountNumber + "\n" + "Current balance " + balance + "\n";
    }
}
