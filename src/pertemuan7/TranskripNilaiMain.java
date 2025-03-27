package pertemuan7;

public class TranskripNilaiMain {
    public static void main(String[] args) {

        Dosen dosen1 = new Dosen("001", "DR. IR. Leony Lidya, M.T.");
        Dosen dosen2 = new Dosen("002", "Siroj Nur Ulum, S.T., M.T.");

        MataKuliah mk1 = new MataKuliah("001", "Algorithm and Programming 1",  3, "A" , dosen1);
        MataKuliah mk2 = new MataKuliah("002", "Algorithm and Programming 2",  3, "BC" , dosen1);
        MataKuliah mk3 = new MataKuliah("003", "Pemrograman Berorientasi Objek",  3, "B" , dosen2);

        Semester s1 = new Semester(2);
        s1.addMataKuliah(mk1);
        s1.addMataKuliah(mk2);

        Semester s2 = new Semester(4);
        s2.addMataKuliah(mk3);

        Mahasiswa mhs = new Mahasiswa("123", "Budi");
        TranskripNilai transkrip = new TranskripNilai(mhs);
        transkrip.addSemester(s1);
        transkrip.addSemester(s2);
        transkrip.display();
    }
}
