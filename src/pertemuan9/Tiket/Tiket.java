package pertemuan9.Tiket;

public class Tiket {
    protected String tujuan;
    protected double harga;

    public Tiket(String tujuan, double harga) {
        this.tujuan = tujuan;
        this.harga = harga;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}
