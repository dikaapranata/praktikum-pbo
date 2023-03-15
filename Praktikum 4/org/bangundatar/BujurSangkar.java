/*
	BujurSangkar.java  15/03/2023
	Nama      : Handhika Pranata Kusuma Wardana
	NIM       : 24060121140112
	Deskripsi : representasi dasar dari objek bujur sangkar, turunan kelas poligon
*/

package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon {
    private double panjangSisi;

    public BujurSangkar(double panjangSisi) {
        this.panjangSisi = panjangSisi;
        this.setJumlahSisi(4);
    }

    public double hitungLuas() {
        return panjangSisi * panjangSisi;
    }

    public double getPanjangSisi() {
        return panjangSisi;
    }
}
