package pertemuan11.latihan2;

// Kelas KartuElektronik mengimplementasikan interface Kartu
// Menyimpan kodeBank dan pin sebagai data kartu
public class KartuElektronik implements Kartu {
    private String kodeBank; // kode bank pemilik kartu
    private String pin;      // pin asli untuk otentikasi

    // Constructor untuk mengisi kodeBank dan pin saat objek dibuat
    public KartuElektronik(String kodeBank, String pin) {
        super();  // panggilan ke constructor superclass (Object), bisa dihapus juga
        this.kodeBank = kodeBank;
        this.pin = pin;
    }

    // Implementasi method otentikasi dari interface Kartu
    // Mengecek apakah pin yang dimasukkan sama dengan pin yang tersimpan
    @Override
    public boolean otentikasi(String pinInput) {
        return pin.equals(pinInput);  // langsung return hasil perbandingan
    }

    // Implementasi method encode dari interface Kartu
    // Saat ini belum diisi (return null), bisa dikembangkan nanti
    @Override
    public String encode(String pin) {
        return null;
    }
}

