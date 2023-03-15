/*
	Poligon.java  15/03/2023
	Nama      : Handhika Pranata Kusuma Wardana
	NIM       : 24060121140112
	Deskripsi : representasi dasar dari objek poligon (segi banyak)
*/

package org.poligon;

public class Poligon {
    protected int jumlahSisi;

    public Poligon() {
    }

    public void setJumlahSisi(int sisi) {
        this.jumlahSisi = sisi;
    }

    public int getJumlahSisi() {
        return this.jumlahSisi;
    }
}
