/**
* File		: LambdaHashmap.java 04/06/2023
* Penulis	: Handhika Pranata Kusuma Wardana - 24060121140112
* Deskripsi	: Implementasi lambda pada hash map
* Lab		: B1
*/

import java.util.HashMap;
import java.util.Map;

public class LambdaHashmap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060121140112", "Dika");
        mahasiswaMap.put("24060121140108", "Sulthan");
        mahasiswaMap.put( "24020222140077", "icin" );

        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " +nim+ ", Nama: " +nama));
    }
}
