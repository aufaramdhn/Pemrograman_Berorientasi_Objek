package pertemuan7;

import java.util.ArrayList;
import java.util.List;

public class Semester {
    private int nomorSemester;
    private List<MataKuliah> daftarMataKuliah;

    public Semester(int nomorSemester) {
        this.nomorSemester = nomorSemester;
        this.daftarMataKuliah = new ArrayList<>();
    }

    public void addMataKuliah(MataKuliah mataKuliah) {
        daftarMataKuliah.add(mataKuliah);
    }

    public int getNomorSemester() {
        return nomorSemester;
    }

    public List<MataKuliah> getDaftarMataKuliah() {
        return daftarMataKuliah;
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        sb.append("Semester ").append(nomorSemester).append(":\n");
        for (MataKuliah mk : daftarMataKuliah) {
            sb.append("- ").append(mk.display()).append("\n");
        }
        return sb.toString();
    }
}
