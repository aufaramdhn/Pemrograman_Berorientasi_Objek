package pertemuan14.tugas3;

public class Counter {
    // Static: hanya ada satu instanceCount untuk seluruh objek Counter
    private static int instanceCount = 0;

    public Counter() {
        // Setiap objek baru menambah 1 ke counter
        instanceCount++;
    }

    public static int getInstanceCount() {
        // Static method dapat dipanggil tanpa membuat objek Counter
        return instanceCount;
    }
}
