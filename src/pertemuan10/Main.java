package pertemuan10;

public class Main {
    public static void main(String[]args) {
        Animal dog = new Dog();
        dog.suara();
        dog.makan();

        Bird b = new Bird();
        b.fly();
        b.suara();
        b.makan();

        Airplane a = new Airplane();
        a.fly();
    }
}
