/**
 * File      : Lingkaran.java		18/05/23
 * Penulis   : Handhika Pranata Kusuma Wardana - 24060121140112
 * Deskripsi : implementasi Lingkaran sebagai BangunDatar
 *
 */

public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }
    public double hitungKeliling() {
        return 2 * jejari * 3.14;
    }
}
