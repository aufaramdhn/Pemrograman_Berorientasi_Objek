package pertemuan14.tugas1;

public class TestAppConfig {
    public static void main(String[] args) {
        // Mengakses konstanta tanpa membuat objek, langsung melalui nama kelas
        System.out.println("Base URL: " + AppConfig.BASE_URL);
        System.out.println("App Version: " + AppConfig.APP_VERSION);
        System.out.println("Default Timeout: " + AppConfig.DEFAULT_TIMEOUT + " ms");
    }
}
