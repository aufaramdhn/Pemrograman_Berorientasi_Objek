package pertemuan9.Tiket;

public class TiketKereta extends Tiket {
    private String kereta;
    private String kelas;
    private String nomorKursi;

    public TiketKereta(String tujuan, double harga, String kereta, String kelas, String nomorKursi) {
        super(tujuan, harga);
        this.kereta = kereta;
        this.kelas = kelas;
        this.nomorKursi = nomorKursi;
    }

    public void Display () {
        System.out.println("Tiket Kereta");
        System.out.println("Tujuan: " + getTujuan());
        System.out.println("Harga: " + getHarga());
        System.out.println("Kereta: " + kereta);
        System.out.println("Kelas: " + kelas);
        System.out.println("Nomor Kursi: " + nomorKursi);
    }

    public String getKereta() {
        return kereta;
    }

    public void setKereta(String kereta) {
        this.kereta = kereta;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getNomorKursi() {
        return nomorKursi;
    }

    public void setNomorKursi(String nomorKursi) {
        this.nomorKursi = nomorKursi;
    }
}
