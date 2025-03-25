package pertemuan6;

import pertemuan5.MataKuliah;

import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
    private String semester;
    private double ips;
    private List<MataKuliah> daftarMataKuliah;

    public KartuHasilStudi(String semester, double ips, List<MataKuliah> daftarMataKuliah) {
        super();
        this.semester = semester;
        this.daftarMataKuliah = new ArrayList<MataKuliah>();
    }

    public void addMataKuliah(MataKuliah mataKuliah) {
        daftarMataKuliah.add(mataKuliah);
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        for (MataKuliah mk : daftarMataKuliah) {
            sb.append(mk.display());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void hitungIPS() {
        double totalBobot = 0;
        double totalSKS = 0;
        for (MataKuliah mk : daftarMataKuliah) {
            totalBobot += mk.nilaiIndex() * mk.getSks();
            totalSKS += mk.getSks();
        }
        ips = totalBobot / totalSKS;
    }
}
