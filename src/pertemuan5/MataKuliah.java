package pertemuan5;

public class MataKuliah {
    private String kode;
    private String nama;
    private int sks;
    private String index;

    public MataKuliah(String kode, String nama, int sks) {
        super();
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.index = "A";
    }

    public int getSks() {
        return sks;
    }

    public double nilaiIndex() {
        if (index.equals("A")) return 4.0;
        else if (index.equals("AB")) return 3.5;
        else if (index.equals("B")) return 3.0;
        else if (index.equals("BC")) return 2.5;
        else if (index.equals("C")) return 2.0;
        else if (index.equals("D")) return 1.0;
        else return 0.0;
    }

    public String display() {
        return "Kode: " + kode + "\nNama: " + nama + "\nSKS: " + sks + "\nIndex: " + index;
    }
}
