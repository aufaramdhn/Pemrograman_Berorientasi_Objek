package pertemuan9.tugas;

public class Employees extends Person{
    private String nip;
    private String jabatan;

    public Employees(String nama, String alamat, String noTelp, String pekerjaan, String nip, String jabatan) {
        super(nama, alamat, noTelp, pekerjaan);
        this.nip = nip;
        this.jabatan = jabatan;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getJabatan() {
        return jabatan;
    }
}
