package pertemuan11.latihan1;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Lingkaran dengan jari-jari 5
        Lingkaran lingkaran = new Lingkaran(10);
        // Menampilkan informasi lingkaran
        lingkaran.Display();

        // Membuat objek Tabung dengan jari-jari 7 dan tinggi 10
        Tabung tabung = new Tabung(10, 5);
        // Menampilkan informasi tabung
        tabung.Display();
    }
}
