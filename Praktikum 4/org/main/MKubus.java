/*
	MKubus.java  15/03/2023
	Nama      : Handhika Pranata Kusuma Wardana
	NIM       : 24060121140112
	Deskripsi : driver class untuk poligon dan kubus
*/

package org.main;

import org.bangundatar.BujurSangkar;
import org.bangunruang.Kubus;

public class MKubus {
    public static void main(String[] args) {
        BujurSangkar bujurSangkar = new BujurSangkar(10);
        System.out.println("Luas Bujur Sangkar : " + bujurSangkar.hitungLuas());
        System.out.println();
        Kubus kubus = new Kubus(bujurSangkar);
        System.out.println("Volume Kubus : " + kubus.hitungVolume());
        System.out.println("Luas alas Kubus : " + kubus.hitungLuasAlas());

    }
}
