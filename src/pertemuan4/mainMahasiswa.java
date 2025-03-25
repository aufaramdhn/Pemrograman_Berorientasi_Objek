package pertemuan4;

public class mainMahasiswa {
    public static void main (String[]args) {
        mahasiswa x = new mahasiswa();
        mahasiswa y = x;
        x.setNRP("01");
        y.setNRP("02");
        System.out.println("NRP x: " + x.getNRP());
        mahasiswa z = new mahasiswa();
        z.setNRP("03");
        x = z;
        System.out.println("NRP x: " + x.getNRP());
        System.out.println("NRP y: " + y.getNRP());
    }
}
