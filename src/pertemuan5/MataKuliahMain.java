package pertemuan5;

public class MataKuliahMain {
    public static void main(String[]args) {
        MataKuliah mk1 = new MataKuliah("IF1234", "Pemrograman Berorientasi Objek", 3);
        MataKuliah mk2 = new MataKuliah("IF1235", "Struktur Data", 3);
        MataKuliah mk3 = new MataKuliah("IF1236", "Algoritma dan Pemrograman", 3);

        System.out.println("--- DAFTAR MATA KULIAH ---");
        System.out.println(mk1.display());
        System.out.println(mk2.display());
        System.out.println(mk3.display());

        System.out.println("--- Nilai IPK ---");
        System.out.println("IPK: " + rumusIPK(mk1, mk2, mk3));

    }
    public static int rumusIPK(MataKuliah mk1, MataKuliah mk2, MataKuliah mk3) {
        return (int) ((mk1.getSks() * mk1.nilaiIndex() + mk2.getSks() * mk2.nilaiIndex() + mk3.getSks() * mk3.nilaiIndex()) / (mk1.getSks() + mk2.getSks() + mk3.getSks()));
    }
}
