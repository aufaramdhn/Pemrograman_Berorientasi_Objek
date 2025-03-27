package pertemuan7;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TranskripNilai {
    private Date tglCetak;
    private double IPK = 0.0;
    private List<KartuHasilStudi> daftarKHS;
    private List<Semester>  daftarSemester;
    private Mahasiswa mahasiswa;

    public TranskripNilai(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.daftarSemester = new ArrayList<>();
        this.daftarKHS = new ArrayList<>();
        this.tglCetak = new Date();
    }

    public void hitungIPK() {
        double totalBobot = 0;
        double totalSKS = 0;

        for (Semester semester : daftarSemester) {
            for (MataKuliah mk : semester.getDaftarMataKuliah()) {
                double nilaiIndex = mk.nilaiIndex();
                int sks = mk.getSks();

                totalBobot += nilaiIndex * sks;
                totalSKS += sks;
            }
        }

        IPK = (totalSKS > 0) ? totalBobot / totalSKS : 0;
    }

    public void addKHS(KartuHasilStudi khs) {
        daftarKHS.add(khs);
        hitungIPK();
    }

    public void addSemester(Semester semester) {
        daftarSemester.add(semester);
        hitungIPK();
    }

    public void display() {
        System.out.println(mahasiswa.display());
        System.out.println("Tanggal Cetak: " + tglCetak);
        System.out.println("IPK: " + IPK+"\n");
        for (Semester semester : daftarSemester) {
            System.out.println(semester.display());
        }
    }
}

