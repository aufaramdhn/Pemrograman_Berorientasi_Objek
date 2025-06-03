package pertemuan14.tugas4;

public class DatabaseConnection {
    public static String connectionString;

    // Static block hanya dijalankan satu kali ketika kelas pertama kali digunakan
    static {
        connectionString = "jdbc:mysql://localhost:3306/mydb";
        System.out.println("Static block executed. Connection string initialized.");
    }
}
