package pertemuan11.StudiKasusLain;

// Kelas Pesawat merupakan turunan dari kelas TransportasiUmum
// Juga mengimplementasikan interface Beroperasi
public class Pesawat extends TransportasiUmum implements Beroperasi {
    // Constructor Pesawat, menerima nama pesawat dan meneruskannya ke constructor TransportasiUmum
    public Pesawat(String nama) {
        super(nama);
    }

    // Implementasi method berangkat() dari kelas TransportasiUmum
    @Override
    public void berangkat() {
        System.out.println("Pesawat " + nama + " berangkat.");
    }

    // Implementasi method tiba() dari kelas TransportasiUmum
    @Override
    public void tiba() {
        System.out.println("Pesawat " + nama + " tiba.");
    }

    // Implementasi method jadiBeroperasi() dari interface Beroperasi
    @Override
    public void jadiBeroperasi() {
        System.out.println("Pesawat " + nama + " sudah beroperasi.");
    }
}
