package OOPS;

public class BankAccount {

    // Private fields — hidden from outside
    private String owner;
    private double balance;

    // Constructor
    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    // Getter (read-only access to owner)
    public String getOwner() {
        return owner;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Another controlled method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}