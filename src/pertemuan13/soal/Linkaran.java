package pertemuan13.soal;

public class Linkaran extends Bentuk{
    private double radius;
    public Linkaran(double radius) {
        this.radius = radius;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}
