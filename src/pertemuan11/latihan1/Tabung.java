package pertemuan11.latihan1;

// Kelas Tabung adalah turunan dari kelas Bentuk
// Ini menggambarkan bentuk tabung, yang memiliki jari-jari dan tinggi
public class Tabung extends Bentuk {
    // Variabel tinggi khusus untuk tabung
    private int tinggi;

    // Constructor tanpa parameter, default jari-jari diatur menjadi 0
    public Tabung() {
        super(0); // Memanggil constructor Bentuk dengan jari-jari 0
    }

    // Constructor dengan parameter jari-jari dan tinggi
    public Tabung(int jari2, int tinggi) {
        super(jari2); // Memanggil constructor Bentuk dengan jari-jari yang diberikan
        this.tinggi = tinggi; // Mengatur nilai tinggi untuk tabung
    }

    // Implementasi method luas() dari kelas Bentuk
    // Rumus luas permukaan tabung: 2 * phi * jari-jari * (jari-jari + tinggi)
    @Override
    public double luas() {
        return 2 * phi * jari2 * (jari2 + tinggi);
    }

    // Getter untuk tinggi, memungkinkan mendapatkan nilai tinggi tabung
    public int getTinggi() {
        return tinggi;
    }

    // Setter untuk tinggi, memungkinkan mengubah nilai tinggi tabung
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    // Method Display() untuk Tabung
    // Ini akan menampilkan informasi tentang tabung, seperti jari-jari, tinggi, dan luas permukaannya
    public void Display() {
        System.out.println("== Tabung ==");
        System.out.println("Jari-jari: " + getJari2() + ", Tinggi: " + getTinggi());
        System.out.println("Luas Permukaan: " + luas());
    }
}
