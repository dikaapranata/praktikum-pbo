/**
* File		    : BangunDatar.java 26-03-2023
* Nama / NIM	: Handhika Pranata Kusuma Wardana / 24060121140112
* Deskripsi	  : Kelas abstrak, berisi abstraksi bangun datar
*/

public abstract class BangunDatar{
	protected double luas;
	
	public abstract double hitungLuas(double sisi);
	
	public void setLuas(double l){
		luas = l;
	}
	
	public double getLuas(){
		return luas;
	}
}
