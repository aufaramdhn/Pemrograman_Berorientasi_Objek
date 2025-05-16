package pertemuan9.Tiket;

public class TiketPesawat extends Tiket { 
    private String maskapai;
    private String kelas;
    private String nomorKursi;
    
    public TiketPesawat(String tujuan, double harga, String maskapai, String kelas, String nomorKursi) {
        super(tujuan, harga);
        this.maskapai = maskapai;
        this.kelas = kelas;
        this.nomorKursi = nomorKursi;
    }

    public void Display () {
        System.out.println("Tiket Pesawat");
        System.out.println("Tujuan: " + getTujuan());
        System.out.println("Harga: " + getHarga());
        System.out.println("Maskapai: " + maskapai);
        System.out.println("Kelas: " + kelas);
        System.out.println("Nomor Kursi: " + nomorKursi);
    }
    
    public String getMaskapai() {
        return maskapai;
    }
    
    public void setMaskapai(String maskapai) {
        this.maskapai = maskapai;
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
