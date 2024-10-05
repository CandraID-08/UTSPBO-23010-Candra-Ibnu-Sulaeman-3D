
package Hotel;



import Hotel.Reservasi;

public class Customer {
    private String Name, nomor;
    private int age, waktu;
    Reservasi hotel = new Reservasi();
    public  Customer(String name, String nomor, int age,  int waktu) {
        this.Name = name;
        this.age = age;
        this.nomor = nomor;
        this.waktu = waktu;
        hotel.setData(Name, nomor, age, waktu);
    }




}

