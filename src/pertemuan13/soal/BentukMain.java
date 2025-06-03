package pertemuan13.soal;

public class BentukMain {
    public static void main(String[] args) {
        Bentuk b1 = new Linkaran(7);
        Bentuk b2 = new Tabung(10, 7);

        System.out.println("Luas Lingkaran: " + b1.hitungLuas());
        System.out.println("Luas Tabung: " + b2.hitungLuas());
    }
}
