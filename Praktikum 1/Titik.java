/*
	Titik.java  23/02/2023
	Nama      : Handhika Pranata Kusuma Wardana
	NIM       : 24060121140112
	Deskripsi : kelas untuk titik
*/

public class Titik{
	//atribut
	double absis;
	double ordinat;
	static int counterTitik;
	
	//konstruktor
	Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}  
	Titik(double a, double o){
		absis = a;
		ordinat = o;
		counterTitik++;
	}
	
	//metode
	void setAbsis(double a){
		absis =a;
	}
	double getAbsis(){
		return absis;
	}
	void setOrdinat(double b){
		ordinat = b;
	}
	double getOrdinat(){
		return ordinat;
	}
	int getCounterTitik(){
		return counterTitik;
	}
}
