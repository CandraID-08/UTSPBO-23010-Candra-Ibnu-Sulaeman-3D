/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Hotel;

public class Reservasi extends Room implements setData {
    String Name, nomor;
    int age, waktu;

    public void setData(String name, String nomor, int age, int waktu) {
        this.Name = name;
        this.age = age;
        this.nomor = nomor;
        this.waktu = waktu;

    }
    
    public void  hapusData() {
        this.Name = null;
        this.age = 0;
        this.waktu = 0;
        this.nomor = null;
        this.jumlahOrang--;
        this.jumlahKamar++;
        this.jenisKamar = null;

        System.out.println("data di hapus");
    }

    @Override
    public void detail() {
        System.out.println("=============================");
        System.out.println("Detail pesanan tamu: ");
        System.out.println("Nama: " + Name);
        System.out.println("Umur: " + age);
        System.out.println("Berapa Malam: "+ waktu);
        System.out.println("Nomor yang bisa di Hub: " + nomor);
        System.out.println("==========================");
    }
}
