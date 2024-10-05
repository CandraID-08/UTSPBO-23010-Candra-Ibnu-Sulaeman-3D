/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package Hotel;

public class Room {
    public  int jumlahKamar = 5, jumlahOrang;
    public String jenisKamar;

    public void pesanKamar (int jumlahKamar, String jenisKamar, int jumlahOrang) {
        this.jumlahKamar -= jumlahKamar;
        this.jumlahOrang += jumlahOrang;
        this.jenisKamar = jenisKamar;
    }

    public void detail() {
        System.out.println("=============================");
        System.out.println("kamar yang tersedia:");
        System.out.println("Jenis kamar: " + jenisKamar);
        System.out.println("Jumlah kamar yang tersedia: " + jumlahKamar);
        System.out.println("Jumlah Orang: " + jumlahOrang);
        System.out.println("==============================");
    }
}
