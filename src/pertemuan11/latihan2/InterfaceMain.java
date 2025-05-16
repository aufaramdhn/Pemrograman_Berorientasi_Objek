package pertemuan11.latihan2;

// Kelas utama untuk menjalankan contoh penggunaan KartuElektronik
public class InterfaceMain {
    public static void main(String[] args) {
        // Membuat objek KartuElektronik dengan id "IF111" dan password "123"
        KartuElektronik kartu = new KartuElektronik("IF111", "123");

        // Memanggil method otentikasi dengan password yang dimasukkan "123"
        // dan menampilkan hasilnya (true/false)
        System.out.println("Otentikasi: " + kartu.otentikasi("123"));
    }
}
