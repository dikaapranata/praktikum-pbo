/**
 * File      : BangunDatarGenericTest.java		18/05/23
 * Penulis   : Handhika Pranata Kusuma Wardana - 24060121140112
 * Deskripsi : main class untuk generic bangun datar
 */

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg =
            new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("Keliling lingkaran = " + bdg.hitungKeliling());
        System.out.println("tipe generic : " +bdg.get().getClass().getName());
    }
}
