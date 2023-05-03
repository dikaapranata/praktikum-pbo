/**
 * File : Sewa.java 03/05/23
 * Penulis : Handhika Pranata Kusuma Wardana / 24060121140112
 * Deskripsi : Sewa.java adalah adalah file main untuk file vehicle, Bus, dan
 * Car.
 *
 */

public class Sewa {

    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();
        kendaraan.calRent(50, 1000);
        mobil.calRent(50, 1000);
        bis.calRent(50, 1000);
    }
}

// javac -cp "." Sewa.javac
// java -cp "." Sewa