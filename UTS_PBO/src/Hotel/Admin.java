package Hotel;


import Hotel.Reservasi;

public class Admin  extends  Customer{
    Reservasi hotel = new Reservasi();
    public Admin(String Name, String nomor, int age, int waktu) {
        super(Name, nomor, age, waktu);
        hotel.setData(Name, nomor, age, waktu);
    }


}