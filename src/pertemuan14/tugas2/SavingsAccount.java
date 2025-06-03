package pertemuan14.tugas2;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    // ERROR: Tidak bisa override karena method displayAccountInfo() adalah final
    /*
    @Override
    public void displayAccountInfo() {
        // Compiler akan memberikan error:
        // "Cannot override the final method from BankAccount"
        System.out.println("Ini tidak boleh dilakukan karena method final.");
    }
    */

    // ✅ Solusi yang benar: Tambahkan method baru khusus subclass
    public void displaySavingsInfo() {
        super.displayAccountInfo(); // Tetap panggil method final dari superclass
        System.out.println("Account Type: Savings");
        // Bisa tambahkan info khusus tabungan di sini
    }
}
