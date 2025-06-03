package pertemuan14.tugas5;

public class Mahasiswa {
    private final String nim; // Final: tidak dapat diubah setelah di-set di konstruktor
    private String nama;

    private static int totalMahasiswa = 0; // Static: milik kelas, satu untuk semua objek
    public static final int MAX_SKS = 24;  // Static final: konstanta global untuk seluruh mahasiswa

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        totalMahasiswa++; // Menambah jumlah mahasiswa setiap objek dibuat
    }

    public void displayInfo() {
        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Max SKS: " + MAX_SKS);
    }

    public static int getTotalMahasiswa() {
        return totalMahasiswa;
    }
}

