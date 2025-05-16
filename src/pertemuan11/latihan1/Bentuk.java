package pertemuan11.latihan1;

// Kelas Bentuk adalah kelas abstrak (tidak bisa dibuat objeknya langsung)
// Ini digunakan sebagai dasar untuk kelas-kelas lain yang memiliki bentuk spesifik.
public abstract class Bentuk {
    // Nilai phi sebagai konstanta untuk perhitungan lingkaran
    protected double phi = 3.14;
    // Jari-jari dari bentuk, diset sebagai integer
    protected int jari2;

    // Constructor Bentuk, menerima nilai jari-jari dan mengisinya ke variabel jari2
    public Bentuk(int jari2) {
        super(); // Memanggil constructor dari superclass (tidak terlalu dibutuhkan di sini)
        this.jari2 = jari2;
    }

    // Method abstrak luas(), harus diimplementasikan di kelas turunan
    // Setiap bentuk akan punya cara perhitungan luas yang berbeda
    public abstract double luas();

    // Getter untuk jari-jari, memungkinkan untuk mendapatkan nilai jari2
    public int getJari2() {
        return jari2;
    }

    // Setter untuk jari-jari, memungkinkan untuk mengubah nilai jari2
    public void setJari2(int jari2) {
        this.jari2 = jari2;
    }
}