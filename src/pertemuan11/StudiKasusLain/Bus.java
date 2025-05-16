package pertemuan11.StudiKasusLain;

// Kelas Bus adalah turunan dari kelas TransportasiUmum
// Juga mengimplementasikan interface Beroperasi
public class Bus extends TransportasiUmum implements Beroperasi {
    // Constructor Bus, menerima nama bus dan meneruskannya ke constructor TransportasiUmum
    public Bus(String nama) {
        super(nama);
    }

    // Implementasi method berangkat() dari kelas TransportasiUmum
    @Override
    public void berangkat() {
        System.out.println("Bus " + nama + " berangkat.");
    }

    // Implementasi method tiba() dari kelas TransportasiUmum
    @Override
    public void tiba() {
        System.out.println("Bus " + nama + " tiba.");
    }

    // Implementasi method jadiBeroperasi() dari interface Beroperasi
    @Override
    public void jadiBeroperasi() {
        System.out.println("Bus " + nama + " sudah beroperasi.");
    }
}
