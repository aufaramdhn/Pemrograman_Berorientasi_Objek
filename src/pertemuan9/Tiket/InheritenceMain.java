package pertemuan9.Tiket;

public class InheritenceMain {
    public static void main(String[]args) {
        TiketPesawat TP = new TiketPesawat("Jakarta", 1000000, "Garuda Indonesia", "Ekonomi", "12A");
        TP.Display();

        System.out.println("=====================");

        TiketKereta TK = new TiketKereta("Jakarta", 500000, "Argo Parahyangan", "Eksekutif", "A1");
        TK.Display();
    }
}
