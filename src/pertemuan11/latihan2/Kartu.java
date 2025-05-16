package pertemuan11.latihan2;

// Interface Kartu yang mendefinisikan dua method utama:
// 1. otentikasi() untuk memeriksa kecocokan PIN
// 2. encode() untuk mengubah PIN menjadi format tertentu (misal untuk keamanan)
public interface Kartu {
    boolean otentikasi(String pin);
    String encode(String pin);
}
