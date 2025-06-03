package pertemuan13.soal;

public class Tabung extends Linkaran{
    private double tinggi;

    public Tabung(double tinggi, double radius) {
        super(radius);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        // Rumus luas permukaan tabung: 2 * π * r * (r + tinggi)
        return 2 * super.hitungLuas() + 2 * Math.PI * getRadius() * tinggi;
    }
}
