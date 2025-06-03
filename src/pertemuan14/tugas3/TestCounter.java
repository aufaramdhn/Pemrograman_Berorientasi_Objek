package pertemuan14.tugas3;

public class TestCounter {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter(); // Total: 3 objek

        System.out.println("Jumlah objek Counter yang dibuat: " + Counter.getInstanceCount());
    }
}
