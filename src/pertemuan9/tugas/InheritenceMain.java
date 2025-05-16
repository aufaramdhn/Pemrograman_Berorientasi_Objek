package pertemuan9.tugas;

public class InheritenceMain {
    public static void main(String [] args) {
        Departemen d = new Departemen("John Doe", "Jakarta", "08123456789", "Programmer", "123456789", "Manager", "IT");

        System.out.println("Nama: " + d.getNama());
        System.out.println("Alamat: " + d.getAlamat());
        System.out.println("No Telepon: " + d.getNoTelp());
        System.out.println("Pekerjaan: " + d.getPekerjaan());
        System.out.println("NIP: " + d.getNip());
        System.out.println("Jabatan: " + d.getJabatan());
        System.out.println("Departemen: " + d.getDepartemen());
    }
}
