/*
	Segitiga.java  08/03/2023
	Nama      : Handhika Pranata Kusuma Wardana
	NIM       : 24060121120012
	Deskripsi : Representasi dasar dari Segitiga turunan poligon
*/

package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
    private double alas,tinggi;

    public Segitiga(double alas,double tinggi,int jumlahSisi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }
    public double hitungLuas(){
        return (alas * tinggi) / 2;
    }
    public void printInfo(){
        System.out.println("Bangun Segitiga berisi "+ this.getJumlahSisi());
    }
}