package OOPS;

public class EncapsulationBankAccount extends BankAccount {

    public EncapsulationBankAccount(String owner, double balance) {
        super(owner, balance);

    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Alice", 1000);

        System.out.println(acc.getOwner());
        System.out.println("Balance: " + acc.getBalance());

        acc.deposit(500);
        System.out.println("Balance Deposit: " + acc.getBalance());
        acc.withdraw(200);
        System.out.println("Balance Withdraw: " + acc.getBalance());

        System.out.println("Final Balance: " + acc.getBalance());
    }
}
