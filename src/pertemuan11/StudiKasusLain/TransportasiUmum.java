package pertemuan11.StudiKasusLain;

// Kelas TransportasiUmum adalah kelas abstrak (tidak bisa dibuat objeknya langsung)
// Ini menjadi dasar untuk berbagai jenis transportasi umum
public abstract class TransportasiUmum {
    // Variabel nama untuk menyimpan nama dari transportasi
    protected String nama;

    // Constructor TransportasiUmum, menerima nama transportasi
    public TransportasiUmum(String nama) {
        this.nama = nama;
    }

    // Method abstrak berangkat() yang harus diimplementasikan di kelas turunan
    public abstract void berangkat();

    // Method abstrak tiba() yang harus diimplementasikan di kelas turunan
    public abstract void tiba();

    // Method info() untuk menampilkan informasi nama transportasi
    public void info() {
        System.out.println("Nama Transportasi: " + nama);
    }
}
