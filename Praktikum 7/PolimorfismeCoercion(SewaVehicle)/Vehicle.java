/**
 * File : Vehicle.java 03/05/23
 * Penulis : Handhika Pranata Kusuma Wardana / 24060121140112
 * Deskripsi : Vehicle.java adalah adalah kelas yang berisi rumus untuk
 * menghitung harga sewa kendaraan.
 *
 */

public class Vehicle {
    void calRent(int distance, float price) {
        float fare = distance * price;
        System.out.println("vehicle price = " + fare);
    }
}