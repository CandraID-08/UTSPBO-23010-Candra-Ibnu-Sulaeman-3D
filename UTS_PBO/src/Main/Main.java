package Main;

import Hotel.Customer;
import Hotel.Admin;
import Hotel.Reservasi;
import Hotel.Room;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Reservasi hotel = new Reservasi();
        Room kmt = new Room();

        
        System.out.println("Pilih masuk : ");
        System.out.println("1. Customer");
        System.out.println("2. Admin");
        System.out.print("Pilih sebagai: ");
        int pilih = input.nextInt();
        input.nextLine();

        switch (pilih) {
            case 1:
                System.out.println("Pilih opsi:");
                System.out.println("1. Tambah data costumer");
                System.out.println("2. Tampilkan data");
                System.out.print("masukan pilihan: ");
                int pilihcustomer = input.nextInt();
                input.nextLine();
                switch (pilihcustomer) {
                    case 1:
                        System.out.print("Masukkan nama: ");
                        String name = input.nextLine();
                        System.out.print("Masukkan nomor aktif: ");
                        String nomor = input.nextLine();
                        System.out.print("Masukkan umur: ");
                        int age = input.nextInt();
                        System.out.print("Berapa malam: ");
                        int waktu = input.nextInt();


                        System.out.println("=====================");
                        System.out.println("Konfirmasi Data Pemesanan:");
                        System.out.println("Nama: " + name);
                        System.out.println("Nomor aktif: " + nomor);
                        System.out.println("Umur: " + age);
                        System.out.println("Lama menginap: " + waktu + " hari");
                        System.out.println("=====================");

                System.out.print("Apakah data sudah benar? (y/n): ");
                char confirm = input.next().charAt(0);

                if (confirm == 'y' || confirm == 'Y') {
                        /*ini kartu ucapan*/
                        System.out.println("=====================");
                        System.out.println("Halo sahabat " + name);
                        System.out.println("Selamat datang di hotel kami");
                        System.out.println("Ini ID pesananmu ##########");
                        System.out.println("Dengan waktu reservasi " + waktu + " hari");
                        System.out.println("Selamat menikmati hari-harimu");
                        System.out.println("=======================");


            Customer customer = new Admin(name, nomor, age, waktu);
        } else {
            System.out.println("Silakan ulangi pemesanan.");
        }
                        break;
                    case 2:
                        hotel.detail();
                        break;
                    default:
                        System.out.println("Opsi tidak valid.");
                        break;
                }
                break;

            default:
                System.out.println("Opsi tidak valid.");
                break;   
            case 2:
                System.out.print("Masukkan username: ");
                String userName = input.nextLine();
                System.out.print("Masukkan password: ");
                String password = input.nextLine();


                if (!userName.equals("admin") || !password.equals("admin123")) {
                    System.out.println("Username atau password salah");
                    return;
                }

                System.out.println("Pilih opsi admin:");
                System.out.println("1. Tambah data costumer");
                System.out.println("2. Tampilkan data");
                System.out.println("3. hapus data");
                System.out.print("masukan pilihan: ");
                int pilihadmin = input.nextInt();
                input.nextLine();

                switch (pilihadmin) {
                    case 1:
                        System.out.print("Masukkan nama: ");
                        String name = input.nextLine();
                        System.out.print("Masukkan nomor aktif: ");
                        String nomor = input.nextLine();
                        System.out.print("Masukkan umur: ");
                        int age = input.nextInt();
                        System.out.print("Berapa malam: ");
                        int waktu = input.nextInt();

                        System.out.println("=====================");
                        System.out.println("Konfirmasi Data Pemesanan:");
                        System.out.println("Nama: " + name);
                        System.out.println("Nomor aktif: " + nomor);
                        System.out.println("Umur: " + age);
                        System.out.println("Lama menginap: " + waktu + " hari");
                        System.out.println("=====================");

                System.out.print("Apakah data sudah benar? (y/n): ");
                char confirm = input.next().charAt(0);

                if (confirm == 'y' || confirm == 'Y') {
                        /*ini juga kartu ucapan*/
                        System.out.println("=====================");
                        System.out.println("Halo sahabat " + name);
                        System.out.println("Selamat datang di hotel kami");
                        System.out.println("Ini ID pesananmu ##########");
                        System.out.println("Dengan waktu reservasi " + waktu + " hari");
                        System.out.println("Selamat menikmati hari-harimu");
                        System.out.println("=======================");

            Customer customer = new Admin(name, nomor, age, waktu);
        } else {
            System.out.println("Silakan ulangi pemesanan.");
        }
                        break;

                    case 2:
                        hotel.detail();
                        kmt.detail();
                        break;

                    case 3:
                        hotel.hapusData();

                    default:
                        System.out.println("Opsi tidak valid.");
                        break;
                }
                break;
                

        }

        input.close();
    }
}
