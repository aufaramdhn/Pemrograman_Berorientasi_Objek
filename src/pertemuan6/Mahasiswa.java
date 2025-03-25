package pertemuan6;

public class Mahasiswa {
    private static String NRP;
    private static String nama;

    public Mahasiswa(String nRP, String nama) {
        super();
        this.NRP = NRP;
        this.nama = nama;
    }

    public String display() {
        return "NRP: " + NRP + "\nNama: " + nama;
    }

    public String getNRP() {
        return NRP;
    }

    public void setNRP(String NRP) {
        this.NRP = NRP;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
