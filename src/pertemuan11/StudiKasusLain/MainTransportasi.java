package pertemuan11.StudiKasusLain;

// Kelas MainTransportasi sebagai program utama untuk menjalankan contoh transportasi umum
public class MainTransportasi {
    public static void main(String[] args) {
        // Membuat objek transportasi dari berbagai jenis (Pesawat, Kereta, dan Bus)
        TransportasiUmum pesawat = new Pesawat("Garuda");
        TransportasiUmum kereta = new Kereta("KRL");
        TransportasiUmum bus = new Bus("TransJakarta");

        // Menampilkan informasi, berangkat, dan tiba untuk Bus
        bus.info();
        bus.berangkat();
        bus.tiba();

        System.out.println(); // Membuat jarak antar output biar lebih rapi

        // Menampilkan informasi, berangkat, dan tiba untuk Pesawat
        pesawat.info();
        pesawat.berangkat();
        pesawat.tiba();

        System.out.println();

        // Menampilkan informasi, berangkat, dan tiba untuk Kereta
        kereta.info();
        kereta.berangkat();
        kereta.tiba();
//        kereta.jadiBeroperasi();
    }
}

