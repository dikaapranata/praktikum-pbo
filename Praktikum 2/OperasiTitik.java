/*
	  File      : perasiTitik.java  02/03/2023
	  Nama      : Handhika Pranata Kusuma Wardana
	  NIM       : 240601211140112
	  Deskripsi : Kelas untuk OperasiTitik
*/

public class OperasiTitik {

    // dengan menggunakan Private method
    private void refleksiSumbuX(Titik t1){
        t1.setAbsis(t1.getAbsis());
        t1.setOrdinat(-1*(t1.getOrdinat()));
    }

    private void refleksiSumbuY(Titik t1){
        t1.setAbsis(-1*(t1.getAbsis()));
        t1.setOrdinat(t1.getOrdinat());
    }

    // dengan menggunakan Public method
    public Titik refleksiX(Titik t1){
        refleksiSumbuX(t1);
        return t1;
    }

    public Titik refleksiY(Titik t1){
        refleksiSumbuY(t1);
        return t1;
    }
}