package pertemuan14.tugas2;

public class MainBankAccount {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("1234567890");
        sa.deposit(1000.0);

        // sa.displayAccountInfo(); // memanggil method final dari superclass
        sa.displaySavingsInfo(); // solusi yang diperbolehkan
    }
}
