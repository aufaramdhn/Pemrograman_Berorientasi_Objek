package Pertemuan6;

public class TranskripNilaiMain {
    public static void main(String[] args) {
        MataKuliah mk1 = new MataKuliah("001", "Algorithm and Programming 1",  3, "A");
        MataKuliah mk2 = new MataKuliah("002", "Algorithm and Programming 2",  3, "BC");
        MataKuliah mk3 = new MataKuliah("003", "Pemrograman Berorientasi Objek",  3, "B");

        KartuHasilStudi khs = new KartuHasilStudi("2022");
        khs.addMataKuliah(mk1);
        khs.addMataKuliah(mk2);
        khs.addMataKuliah(mk3);

        Mahasiswa mhs = new Mahasiswa("123", "Budi");

        TranskripNilai transkrip = new TranskripNilai(mhs);
        transkrip.addKHS(khs);
        transkrip.display();
    }
}
