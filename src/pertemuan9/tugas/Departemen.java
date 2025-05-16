package pertemuan9.tugas;

public class Departemen extends Employees {
    private String departemen;

    public Departemen(String nama, String alamat, String noTelp, String pekerjaan, String nip, String jabatan, String departemen) {
        super(nama, alamat, noTelp, pekerjaan, nip, jabatan);
        this.departemen = departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

}
