package pertemuan14.tugas2;

public class BankAccount {
    private final String accountNumber; // Final: tidak bisa diubah setelah inisialisasi di konstruktor
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber; // Inisialisasi final field di konstruktor
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public final void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}
