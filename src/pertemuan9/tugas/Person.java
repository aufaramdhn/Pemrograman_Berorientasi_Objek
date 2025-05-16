package pertemuan9.tugas;

public class Person {
    protected String nama;
    protected String alamat;
    protected String noTelp;
    protected String pekerjaan;

    public Person(String nama, String alamat, String noTelp, String pekerjaan) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.pekerjaan = pekerjaan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

}
