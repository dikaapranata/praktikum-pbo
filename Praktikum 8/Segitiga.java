/**
 * File      : Segitiga.java		18/05/23
 * Penulis   : Handhika Pranata Kusuma Wardana - 24060121140112
 * Deskripsi : implementasi Segitiga sebagai BangunDatar
 *
 */

 public class Segitiga extends BangunDatar{
    private double sisi;

    public Segitiga(double sisi) {
        this.sisi = sisi;
    }
    public double hitungKeliling() {
        return sisi + sisi + sisi;
    }
}
