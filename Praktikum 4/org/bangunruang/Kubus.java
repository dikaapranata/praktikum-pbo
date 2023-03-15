/*
	Kubus.java  15/03/2023
	Nama      : Handhika Pranata Kusuma Wardana
	NIM       : 24060121140112
	Deskripsi : representasi dasar dari objek kubus, turunan kelas poligon
*/

package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus {
    private BujurSangkar permukaan;

    public Kubus(BujurSangkar permukaan) {
        this.permukaan = permukaan;
    }

    public double hitungVolume() {
        double panjangSisi = permukaan.getPanjangSisi();
        return panjangSisi * panjangSisi * panjangSisi;
    }

    public double hitungLuasAlas() {
        return permukaan.hitungLuas();
    }
}
