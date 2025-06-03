package pertemuan14.tugas5;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa M1 = new Mahasiswa("233040001", "Mitsuki");
        Mahasiswa M2 = new Mahasiswa("233040002", "Honoe");

        M1.displayInfo();
        System.out.println();
        M2.displayInfo();

        // Menampilkan total mahasiswa tanpa perlu objek
        System.out.println("\nTotal Mahasiswa: " + Mahasiswa.getTotalMahasiswa());
    }
}

