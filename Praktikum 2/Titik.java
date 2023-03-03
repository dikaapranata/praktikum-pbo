/*
	 File       : Titik.java  02/03/2023
	  Nama      : Handhika Pranata Kusuma Wardana
	  NIM       : 240601211140112
	  Deskripsi : Kelas yang berisi method titik
*/
 
class Titik { 
    // atribut
    private double absis;
    private double ordinat;
    static int counterTitik;

    // konstruktor
    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    // overload new constructor
    Titik(double x, double y) {
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    Titik(int x, int y) {
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    // method
    public void setAbsis(double x) {
        absis = x;
    }

    public void setOrdinat(double y) {
        ordinat = y;
    }

    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    public int getCounterTitik() {
        return counterTitik;
    }

}
 