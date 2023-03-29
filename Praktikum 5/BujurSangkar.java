/**
* File		    : BujurSangkar.java 26-03-2023
* Nama / NIM	    : Handhika Pranata Kusuma Wardana / 24060121140112
* Deskripsi	    : Kelas yang membuat implementasi metode abstrak pada bangun datar
*/

public class BujurSangkar extends BangunDatar{
	//apabila kelas BujurSangkar tidak membuat implementasi metode abstrak yang ada pada kelas BangunDatar 
	//maka kelas BujurSangkar juga harus dideklarasikan sebagai kelas abstrak. 
	//Ini karena, kelas BujurSangkar akan mewarisi metode abstrak dari kelas induknya (BangunDatar) 
	//tetapi tidak memberikan implementasi untuk metode abstrak tersebut.
	public double hitungLuas(double sisi){
		luas = sisi*sisi;
		return luas;
	}
}
