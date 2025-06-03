package pertemuan14.tugas4;

public class TestDatabaseConnection {
    public static void main(String[] args) {
        // Mengakses connectionString akan menyebabkan kelas DatabaseConnection dimuat
        System.out.println("Connection String: " + DatabaseConnection.connectionString);
    }
}
