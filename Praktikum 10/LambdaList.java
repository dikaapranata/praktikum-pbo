/**
 * File      : Lambdalist.java	04/06/2023
 * Penulis	 : Handhika Pranata Kusuma Wardana - 24060121140112
 * Deskripsi : Implementasi lambda pada list, digunakan sebagai parameter pada method.
 *
 */

 import java.util.ArrayList;

 public class LambdaList {
     public static void main(String[] args) {
         ArrayList<String> mahasiswaList = new ArrayList<>();
         mahasiswaList.add("Dika");
         mahasiswaList.add("Sulthan");
         mahasiswaList.add("Icin");
         mahasiswaList.add("Mukhlis");
 
         //lambda digunakan sebagai parameter pada method
         mahasiswaList.forEach((nama) -> System.out.println(nama));
     }
 }