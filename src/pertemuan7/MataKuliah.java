package pertemuan7;

public class MataKuliah {
    String kode;
    String namaMK;
    int sks;
    String indexNilai;
    Dosen dosen;

    public MataKuliah(String kode, String nama, int sks, String indexNilai, Dosen dosen) {
        super();
        this.kode = kode;
        this.namaMK = nama;
        this.sks = sks;
        this.indexNilai = indexNilai;
        this.dosen = dosen;

    }

    public double nilaiIndex() {
        if (indexNilai.equals("A")) {
            return 4.0;
        } else if (indexNilai.equals("AB")) {
            return 3.5;
        } else if (indexNilai.equals("B")) {
            return 3.0;
        } else if (indexNilai.equals("BC")) {
            return 2.5;
        } else if (indexNilai.equals("C")) {
            return 2.0;
        } else if (indexNilai.equals("D")) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    public String display() {
        return kode + " - " + namaMK + " - " + indexNilai + " - " + sks + " - " + dosen.getNama();
    }

    public int getSks() {
        return sks;
    }

    public String getIndexNilai() {
        return indexNilai;
    }

    public Dosen getDosen() {
        return dosen;
    }
}
