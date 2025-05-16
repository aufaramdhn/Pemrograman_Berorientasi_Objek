package pertemuan11.latihan1;

// Kelas Lingkaran adalah turunan dari kelas Bentuk
// Ini adalah kelas konkret (bukan abstrak), jadi bisa dibuat objeknya
public class Lingkaran extends Bentuk {
    // Constructor Lingkaran, menerima nilai jari-jari dan meneruskannya ke constructor Bentuk
    public Lingkaran(int jari2) {
        super(jari2);
    }

    // Implementasi method luas() dari kelas Bentuk
    // Karena ini lingkaran, rumus luasnya adalah phi * jari2 * jari2
    @Override
    public double luas() {
        return phi * jari2 * jari2;
    }

    // Method Display() untuk Lingkaran
    // Ini akan menampilkan informasi tentang lingkaran, seperti jari-jari dan luasnya
    public void Display() {
        System.out.println("== Lingkaran ==");
        System.out.println("Jari-jari: " + getJari2());
        System.out.println("Luas: " + luas());
    }
}
