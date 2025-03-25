//package pertemuan6;
//
//import pertemuan5.MataKuliah;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//public class TranskripNilai extends MataKuliah {
//    private Date tglCetak;
//    private double IPK = 0.0;
//    private List<KartuHasilStudi> KartuHasilStudi;
//    private Mahasiswa mahasiswa;
//
//    public TranskripNilai(Mahasiswa mahasiswa) {
//        super();
//        this.mahasiswa = mahasiswa;
//
//        KartuHasilStudi = new ArrayList<KartuHasilStudi>();
//        tglCetak = new Date();
//    }
//
//    public void hitungIPK() {
//        double totalBobot = 0;
//        double totalSKS = 0;
//        for (KartuHasilStudi khs : KartuHasilStudi) {
//            khs.hitungIPS();
//            totalBobot += khs.getIPS() * khs.getTotalSKS();
//            totalSKS += khs.getTotalSKS();
//        }
//        IPK = totalBobot / totalSKS;
//    }
//
//    public void addKHS(KartuHasilStudi khs) {
//        KartuHasilStudi.add(khs);
//    }
//
//    public void display() {
//        System.out.println(Mahasiswa.display());
//        System.out.println("Tanggal Cetak: " + tglCetak.toString());
//        System.out.println("IPK: " + IPK);
//        for (KartuHasilStudi khs : KartuHasilStudi) {
//            System.out.println(khs.display());
//        }
//    }
//}
