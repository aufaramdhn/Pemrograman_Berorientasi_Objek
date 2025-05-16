package pertemuan9;

public class InheritenceMain {
    public static void main(String[]args) {

//        Latihan 1
//        Mahasiswa mhs = new Mahasiswa();
//        mhs.setNama("John Doe");
//        System.out.println(mhs.getNama());

//        Latihan 2
//        Mahasiswa mhs = new Mahasiswa();
//        System.out.println(mhs.getNama() + "-" + mhs.getAlamat());

//        latihan 3
//        Mahasiswa mhs = new Mahasiswa("Ade Sukandar", "Bandung");
//        System.out.println(mhs.getNama() + " - " + mhs.getAlamat());

//        latihan 4
        Mahasiswa mhs = new Mahasiswa("10001","Ade Sukandar", "Bandung");
        System.out.println(mhs.getNrp()
                + " - " + mhs.getNama()
                + " - " + mhs.getAlamat());
    }
}
