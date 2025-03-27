package pertemuan7;

import java.util.ArrayList;
import java.util.List;

public class Dosen {
    private String NIDN;
    private String nama;
    private List<MataKuliah> daftarMataKuliah;

    public Dosen(String NIDN, String nama) {
        this.NIDN = NIDN;
        this.nama = nama;
        this.daftarMataKuliah = new ArrayList<>();
    }

    public void tambahMataKuliah(MataKuliah mk) {
        daftarMataKuliah.add(mk);
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        sb.append("NIDN: ").append(NIDN).append(", Nama: ").append(nama).append("\nMata Kuliah yang diajar:\n");
        for (MataKuliah mk : daftarMataKuliah) {
            sb.append("- ").append(mk.display()).append("\n");
        }
        return sb.toString();
    }

    public String getNIDN() {
        return NIDN;
    }

    public String getNama() {
        return nama;
    }
}
