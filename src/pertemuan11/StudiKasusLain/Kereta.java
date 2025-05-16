package pertemuan11.StudiKasusLain;

// Kelas Kereta adalah turunan dari kelas TransportasiUmum
// Juga mengimplementasikan interface Beroperasi
public class Kereta extends TransportasiUmum implements Beroperasi {
    // Constructor Kereta, menerima nama kereta dan meneruskannya ke constructor TransportasiUmum
    public Kereta(String nama) {
        super(nama);
    }

    // Implementasi method berangkat() dari kelas TransportasiUmum
    @Override
    public void berangkat() {
        System.out.println("Kereta " + nama + " berangkat.");
    }

    // Implementasi method tiba() dari kelas TransportasiUmum
    @Override
    public void tiba() {
        System.out.println("Kereta " + nama + " tiba.");
    }

    // Implementasi method jadiBeroperasi() dari interface Beroperasi
    @Override
    public void jadiBeroperasi() {
        System.out.println("Kereta " + nama + " sudah beroperasi.");
    }
}

