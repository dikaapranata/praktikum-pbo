/*

* File		: AngkaSialException.java 02-04-2023
* Nama / NIM    : Handhika Pranata Kusuma Wardana / 24060121140112
* Deskripsi  	: Eksepsi buatan sendiri, menolak masukan angka 13!

*/

public class AngkaSialException extends Exception{
	public AngkaSialException(){
		super("jangan memasukkan angka 13 karena angka sial !!!");
	}
}
